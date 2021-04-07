package org.example.json;

import com.google.gson.*;
import org.apache.log4j.Logger;
import org.example.configuration.AppConfig;
import org.example.configuration.ConfigurationReader;
import org.example.configuration.FileInfo;


import java.io.*;

import static org.example.util.InterfaceSerializerJSON.interfaceSerializer;


public class JSONConfigurationReader implements ConfigurationReader {
    private static final Logger LOGGER = Logger.getLogger(JSONConfigurationReader.class.getName());

    public AppConfig ReadConfiguration() {

        LOGGER.info("method fromJSON is start ");
        JSONConfiguration configuration = null;
        Reader reader;
        try (InputStream resourceAsStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("config.json")) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(FileInfo.class, interfaceSerializer(JSONFileInfo.class))
                    .create();
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
