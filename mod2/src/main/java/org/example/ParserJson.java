package src.main.java.org.example;

import com.google.gson.*;
import org.apache.log4j.Logger;
import sun.util.locale.provider.LocaleServiceProviderPool;


import java.io.*;
/*
Application should read a config file on the startup
Then it should ensure that all of files from the config exist
Then it should rename each file adding a suffix from the config to its name
It should print the results of the renaming like:
old_name -> new_name
 */

public class ParserJson {
        private static final Logger LOGGER = Logger.getLogger(ParserJson.class.getName());

    public Configuration fromJSON() {

        LOGGER.info("method fromJSON is start ");
        Configuration fileName = null;
        try {
            InputStream resourceAsStream = this.getClass()
                    .getClassLoader()
                    .getResourceAsStream("config.json");
            LOGGER.info("configuration data is read" );
            Gson gson = new Gson();
            Reader reader = new InputStreamReader(resourceAsStream, "UTF-8");
            fileName = gson.fromJson(reader, Configuration.class);

        } catch (UnsupportedEncodingException e) {
            LOGGER.error("error has caught",e);
            e.printStackTrace();
        }
        return fileName;
    }
}
