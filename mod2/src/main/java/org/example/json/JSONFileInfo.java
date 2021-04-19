package org.example.json;

import org.example.configuration.FileInfo;

public class JSONFileInfo implements FileInfo {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "org.example.configuration.FileInfo{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
