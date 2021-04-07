package org.example.FileReader;

import org.apache.log4j.Logger;
import org.example.configuration.AppConfig;
import org.example.report.FileProcessReport;
import org.example.report.XMLFileInfoReport;
import org.example.configuration.FileInfo;

import java.io.File;
import java.sql.Time;

import static org.example.report.FileProcessReport.generateProcessReport;

public class FileProcessor {
    private boolean withReport;
    XMLFileInfoReport report;
    private static final Logger LOGGER = Logger.getLogger(FileProcessor.class.getName());
    public  void renameFiles(AppConfig config) {
        FileProcessReport fileReport = new FileProcessReport();
        fileReport.setConfigFileName("reportConfig.xml");
        long currentTime = System.currentTimeMillis();
        for (FileInfo files : config.getFiles()) {
            File oldFile = new File(files.getFileName());
            if (oldFile.exists()) {
                String newFileName = oldFile.getParent() + config.getSuffix() + oldFile.getName();
                report.setOldFileName(oldFile.getName());
                File newFile = new File(newFileName);
                report.setNewFileName(newFileName);
                oldFile.renameTo(newFile);
                System.out.println(files.getFileName() + " > " + newFileName);
                LOGGER.info("files are renamed");
            } else {
                LOGGER.info("files "+files.getFileName()+ " are not renamed");
                System.out.println("File " + files.getFileName() + " is not found");
            }
        }
        fileReport.setExecutionTime(System.currentTimeMillis()-currentTime);
        if(withReport){
            generateProcessReport(report);
        }
    }


}
