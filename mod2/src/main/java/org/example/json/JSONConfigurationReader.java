package org.example.json;

import com.google.gson.*;
import org.apache.log4j.Logger;
import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;


import java.io.*;


public class JSONConfigurationReader implements ConfigurationReader {
    private static final Logger LOGGER = Logger.getLogger(JSONConfigurationReader.class.getName());

    public AppConfig ReadConfiguration() {

        LOGGER.info("method fromJSON is start ");
        JSONConfiguration configuration = null;
        Gson gson;
        Reader reader;
        try (InputStream resourceAsStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("config.json")) {
            gson = new Gson();
            reader = new InputStreamReader(resourceAsStream, "UTF-8");
            configuration = gson.fromJson(reader, JSONConfiguration.class);
            LOGGER.info("configuration data is read");
        } catch (IOException e) {
            LOGGER.error("error has caught", e);
            e.printStackTrace();
        }

        return configuration;
    }
}
