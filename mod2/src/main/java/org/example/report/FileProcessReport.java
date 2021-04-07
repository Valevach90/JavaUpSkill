package org.example.report;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.annotation.XmlElement;
import java.io.*;
import java.util.List;

public class FileProcessReport {
    @XmlElement(name = "ConfigFileName")
    private String configFileName;
    @XmlElement(name = "ExecutionTime")
    private long ExecutionTime;
    @XmlElement(name = "Files")
    private List<XMLFileInfoReport>files;

    public static void generateProcessReport(XMLFileInfoReport report){
        XmlMapper xmlMapper = new XmlMapper();
        try {
            File file = new File("XMLReport");
            xmlMapper.writeValue(file, new FileProcessReport());
            FileWriter fr = new FileWriter("XMLReport");
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getConfigFileName() {
        return configFileName;
    }

    public void setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
    }

    public long getExecutionTime() {
        return ExecutionTime;
    }

    public void setExecutionTime(long executionTime) {
        ExecutionTime = executionTime;
    }

    public List<XMLFileInfoReport> getFiles() {
        return files;
    }

    public void setFiles(List<XMLFileInfoReport> files) {
        this.files = files;
    }
}
