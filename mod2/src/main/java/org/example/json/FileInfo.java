package org.example.json;

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
        return "org.example.json.FileInfo{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
