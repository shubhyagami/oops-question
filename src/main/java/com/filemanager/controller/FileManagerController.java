package com.filemanager.controller;

import com.filemanager.model.FileStatus;
import com.filemanager.repository.FileStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class FileManagerController {

    private final String BASE_DIR = "data/tcs-ipa";

    @Autowired
    private FileStatusRepository fileStatusRepository;

    // DTO passed to Thymeleaf templates
    public static class FileInfo {
        private String name;
        private boolean directory;
        private boolean checked;
        private String fullPath;

        public FileInfo(String name, boolean directory, boolean checked, String fullPath) {
            this.name = name;
            this.directory = directory;
            this.checked = checked;
            this.fullPath = fullPath;
        }

        public String getName() { return name; }
        public boolean isDirectory() { return directory; }
        public boolean isChecked() { return checked; }
        public String getFullPath() { return fullPath; }
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/browse?path=";
    }

    @GetMapping("/browse")
    public String browse(@RequestParam(value = "path", defaultValue = "") String path, Model model) {
        if (path.contains("..")) {
            return "redirect:/browse?path=";
        }

        File currentDir = new File(BASE_DIR, path);
        if (!currentDir.exists() || !currentDir.isDirectory()) {
            return "redirect:/browse?path=";
        }

        File[] dirContents = currentDir.listFiles();
        List<FileInfo> files = new ArrayList<>();

        if (dirContents != null) {
            Arrays.sort(dirContents, (f1, f2) -> {
                if (f1.isDirectory() && !f2.isDirectory()) return -1;
                if (!f1.isDirectory() && f2.isDirectory()) return 1;
                return f1.getName().compareToIgnoreCase(f2.getName());
            });

            // Build full paths for batch lookup
            List<String> fullPaths = new ArrayList<>();
            for (File f : dirContents) {
                String fp = path.isEmpty() ? f.getName() : path + "/" + f.getName();
                fullPaths.add(fp);
            }

            // Batch fetch checked statuses from DB
            Map<String, Boolean> checkedMap = fileStatusRepository
                    .findByFilePathIn(fullPaths)
                    .stream()
                    .collect(Collectors.toMap(FileStatus::getFilePath, FileStatus::isChecked));

            for (File f : dirContents) {
                String fp = path.isEmpty() ? f.getName() : path + "/" + f.getName();
                boolean isChecked = checkedMap.getOrDefault(fp, false);
                files.add(new FileInfo(f.getName(), f.isDirectory(), isChecked, fp));
            }
        }

        model.addAttribute("files", files);
        model.addAttribute("currentPath", path);

        String parentPath = "";
        if (path.length() > 0) {
            int lastSlash = path.lastIndexOf('/');
            if (lastSlash > 0) {
                parentPath = path.substring(0, lastSlash);
            }
        }
        model.addAttribute("parentPath", path.length() > 0 ? parentPath : null);

        return "index";
    }

    // AJAX endpoint to toggle checkbox
    @PostMapping("/api/toggle")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> toggleCheck(@RequestBody Map<String, Object> body) {
        String filePath = (String) body.get("path");
        boolean checked = (boolean) body.get("checked");

        FileStatus status = fileStatusRepository.findByFilePath(filePath)
                .orElse(new FileStatus(filePath, false));
        status.setChecked(checked);
        fileStatusRepository.save(status);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("path", filePath);
        response.put("checked", checked);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/view")
    public String view(@RequestParam("path") String path, Model model) {
        if (path.contains("..")) {
            return "redirect:/browse?path=";
        }

        File file = new File(BASE_DIR, path);
        if (!file.exists() || !file.isFile()) {
            return "redirect:/browse?path=";
        }

        try {
            String content = Files.readString(file.toPath());
            model.addAttribute("content", content);
            model.addAttribute("fileName", file.getName());

            String parentPath = "";
            int lastSlash = path.lastIndexOf('/');
            if (lastSlash > 0) {
                parentPath = path.substring(0, lastSlash);
            }
            model.addAttribute("parentPath", parentPath);

            // Also fetch checked status for this file
            boolean isChecked = fileStatusRepository.findByFilePath(path)
                    .map(FileStatus::isChecked)
                    .orElse(false);
            model.addAttribute("filePath", path);
            model.addAttribute("fileChecked", isChecked);

            return "view";
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:/browse?path=";
        }
    }
}
