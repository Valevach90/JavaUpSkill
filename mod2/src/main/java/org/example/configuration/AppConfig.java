package org.example.configuration;

import org.example.json.JSONFileInfo;

import java.util.List;

public interface AppConfig {
     String getSuffix();

     List<FileInfo> getFiles();


}
