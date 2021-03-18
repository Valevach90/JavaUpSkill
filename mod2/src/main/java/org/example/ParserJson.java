package org.example;

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
    public Configuration fromJSON() throws URISyntaxException {
        Configuration fileName = null;
        try {
            File file = Paths.get(this.getClass()
                    .getClassLoader()
                    .getResource("config.json")
                    .toURI())
                    .toFile();
            FileReader reader = new FileReader(file);
            Gson gson = new Gson();
            fileName = gson.fromJson(reader, Configuration.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public void renameFiles(Configuration config) {
        for (FileInfo files : config.getFiles()) {
            File oldFile = new File(files.getFileName());
            if (oldFile.exists()) {
                String newFileName = oldFile.getParent() + config.getSuffix() + oldFile.getName();
                File newFile = new File(newFileName);
                oldFile.renameTo(newFile);
                System.out.println(files.getFileName() + " > " + newFileName);
            } else {
                System.out.println("File " + files.getFileName()+" is not found");
            }
        }
    }

}
