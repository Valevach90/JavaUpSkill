package org.example.json;

import java.util.List;

public class XMLConfiguration {
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
        return "org.example.json.Configuration{" +
                "suffix='" + suffix + '\'' +
                ", files=" + files +
                '}';
    }
}
