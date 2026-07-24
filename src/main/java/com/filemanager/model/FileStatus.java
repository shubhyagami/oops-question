package com.filemanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "file_status")
public class FileStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 1024)
    private String filePath;

    @Column(nullable = false)
    private boolean checked;

    public FileStatus() {}

    public FileStatus(String filePath, boolean checked) {
        this.filePath = filePath;
        this.checked = checked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
