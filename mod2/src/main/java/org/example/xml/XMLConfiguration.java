package org.example.xml;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;
import org.example.configuration.FileInfo;
import org.example.json.JSONFileInfo;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

public class XMLConfiguration implements AppConfig {
    public XMLConfiguration(){}
    @XmlAttribute(name = "suffix")
    private String suffix;
    @XmlAttribute(name = "files")
    @JsonDeserialize(contentAs = XMLFileInfo.class)
    private List<FileInfo> files;

    public String getSuffix() {
        return suffix;
    }

    public List<FileInfo> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return
                "suffix='" + suffix + '\'' +
                        ", files=" + files +
                        '}';
    }


}
