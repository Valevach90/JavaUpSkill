package org.example;

public class FileInfo {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "org.example.FileInfo{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
