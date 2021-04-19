package org.example.report;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class GenerateReport {
    public static void generateProcessReport(FileProcessReport report){
        XmlMapper xmlMapper = new XmlMapper();
        try {
            File file = new File("XMLReport.xml");
            System.out.println(file.getPath());
            xmlMapper.writeValue(file, report);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
