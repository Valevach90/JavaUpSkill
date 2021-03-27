package src.main.java.org.example;

import com.google.gson.*;


import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;
/*
Application should read a config file on the startup
Then it should ensure that all of files from the config exist
Then it should rename each file adding a suffix from the config to its name
It should print the results of the renaming like:
old_name -> new_name
 */

public class ParserJson {

    public Configuration fromJSON() {
        Configuration fileName = null;
        try {
            InputStream resourceAsStream = this.getClass()
                    .getClassLoader()
                    .getResourceAsStream("config.json");
            Gson gson = new Gson();
            Reader reader = new InputStreamReader(resourceAsStream, "UTF-8");
            fileName = gson.fromJson(reader, Configuration.class);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}