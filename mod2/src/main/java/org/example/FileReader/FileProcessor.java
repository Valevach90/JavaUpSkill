package org.example.FileReader;

import org.apache.log4j.Logger;
import org.example.configuration.AppConfig;
import org.example.report.FileProcessReport;
import org.example.report.XMLFileInfoReport;
import org.example.configuration.FileInfo;

import java.io.File;

public class FileProcessor {
    private static final Logger LOGGER = Logger.getLogger(FileProcessor.class.getName());

    public FileProcessReport renameFiles(AppConfig config) {
        XMLFileInfoReport XMLReport = new XMLFileInfoReport();
        FileProcessReport XMLInfoForReport = new FileProcessReport();
        XMLInfoForReport.setConfigFileName("reportConfig.xml");
        long currentTime = System.currentTimeMillis();
        for (FileInfo files : config.getFiles()) {
            File oldFile = new File(files.getFileName());
            if (oldFile.exists()) {
                String newFileName = oldFile.getParent() + config.getSuffix() + oldFile.getName();
                XMLReport.setOldFileName(oldFile.getName());
                File newFile = new File(newFileName);
                XMLReport.setNewFileName(newFileName);
                oldFile.renameTo(newFile);
                XMLInfoForReport.getFiles().add(XMLReport);
                System.out.println(files.getFileName() + " > " + newFileName);
                LOGGER.info("files are renamed");
            } else {
                LOGGER.info("files " + files.getFileName() + " are not renamed");
                System.out.println("File " + files.getFileName() + " is not found");
            }
        }
        XMLInfoForReport.setExecutionTime(System.currentTimeMillis() - currentTime);
        return XMLInfoForReport;
    }


}
