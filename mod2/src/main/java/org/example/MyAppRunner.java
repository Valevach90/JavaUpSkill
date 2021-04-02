package org.example;

import org.apache.log4j.Logger;
import org.example.FileReader.FileProcessor;
import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;
import org.example.json.JSONConfiguration;
import org.example.json.JSONConfigurationReader;
import org.example.xml.XMLConfiguration;


public class MyAppRunner {

    private static final Logger LOGGER = Logger.getLogger(MyAppRunner.class.getName());

    public static void main(String[] args) {
        ConfigurationReader reader = new JSONConfigurationReader();
        AppConfig config =  new JSONConfiguration();
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.RenameFiles(config);



    }
}
