package org.example.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.log4j.Logger;
import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class XMLConfigurationReader implements ConfigurationReader {
    private static final Logger LOGGER = Logger.getLogger(XMLConfigurationReader.class.getName());


    @Override
    public AppConfig ReadConfiguration() {

        LOGGER.info("method fromJSON is start ");
        AppConfig configuration = null;
        XmlMapper mapper;
        Reader reader;
        try (InputStream resourceAsStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("config.json")) {
            mapper = new XmlMapper();
            reader = new InputStreamReader(resourceAsStream, "UTF-8");
            configuration = (AppConfig) mapper.readValue(reader, XMLConfiguration.class);
            LOGGER.info("configuration data is read");
        } catch (IOException e) {
            LOGGER.error("error has caught", e);
            e.printStackTrace();
        }

        return  configuration;
    }
}