package org.example;

import org.apache.log4j.Logger;
import org.example.FileReader.FileProcessor;
import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;
import org.example.json.JSONConfigurationReader;
import org.example.report.FileProcessReport;
import org.example.xml.XMLConfigurationReader;
import static org.example.report.GenerateReport.generateProcessReport;


public class MyAppRunner {

    private static final Logger LOGGER = Logger.getLogger(MyAppRunner.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Program is started");
        args[0] = "XML";
        ConfigurationReader reader = null;
        if ("XML".equals(args[0])) {
            reader = new JSONConfigurationReader();
        } else if ("JSON".equals(args[0])) {
            reader = new XMLConfigurationReader();
        } else {
            LOGGER.error(" ");
        }
        if (reader != null) {
            AppConfig config = reader.ReadConfiguration();
            FileProcessor fileProcessor = new FileProcessor();
            FileProcessReport XMLFilesForReport = fileProcessor.renameFiles(config);

            if (args[1].equals("true")) {
                generateProcessReport(XMLFilesForReport);
            }
        }
        LOGGER.info("Program is finished");
    }
}
