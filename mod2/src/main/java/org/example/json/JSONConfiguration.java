package org.example.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.configuration.AppConfig;
import org.example.configuration.FileInfo;

import java.util.List;

public class JSONConfiguration implements AppConfig {
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("files")
    private List<FileInfo> files;

    @Override
    public String toString() {
        return "org.example.json.Configuration{" +
                "suffix='" + suffix + '\'' +
                ", files=" + files +
                '}';
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public List<FileInfo> getFiles() {
        return files;
    }
}
