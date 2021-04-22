package org.example;

import java.util.List;

public class Configuration {
    private String suffix;
    private List<FileInfo> files;

    public String getSuffix() {
        return suffix;
    }

    public List<FileInfo> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "org.example.Configuration{" +
                "suffix='" + suffix + '\'' +
                ", files=" + files +
                '}';
    }
}
