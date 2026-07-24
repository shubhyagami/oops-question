package com.filemanager.repository;

import com.filemanager.model.FileStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileStatusRepository extends JpaRepository<FileStatus, Long> {
    Optional<FileStatus> findByFilePath(String filePath);
    List<FileStatus> findByFilePathIn(List<String> filePaths);
}
