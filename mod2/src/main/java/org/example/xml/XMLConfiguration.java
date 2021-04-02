package org.example.xml;

import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;
import org.example.json.JSONFileInfo;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

public class XMLConfiguration implements ConfigurationReader {
    @XmlAttribute(name = "suffix")
    private String suffix;
    @XmlAttribute(name = "files")
    private List<JSONFileInfo> files;

    public String getSuffix() {
        return suffix;
    }

    public List<JSONFileInfo> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "org.example.json.Configuration{" +
                "suffix='" + suffix + '\'' +
                ", files=" + files +
                '}';
    }

    @Override
    public AppConfig ReadConfiguration() {
        return null;
    }
}
