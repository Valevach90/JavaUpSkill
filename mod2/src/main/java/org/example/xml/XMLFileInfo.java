package org.example.xml;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.configuration.FileInfo;

import javax.xml.bind.annotation.XmlAttribute;

public class XMLFileInfo implements FileInfo {

    @XmlAttribute(name = "fileName")
    private String fileName;

    @Override
    public String toString() {
        return "XMLFileInfo{" +
                "fileName='" + fileName + '\'' +
                '}';
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
