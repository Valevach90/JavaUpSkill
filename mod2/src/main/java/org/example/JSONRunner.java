package org.example;


import org.apache.log4j.Logger;

import static org.example.RenameFiles.renameFiles;

public class JSONRunner {
    private static final Logger LOGGER = Logger.getLogger(JSONRunner.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Program is running");
        ParserJson parse = new ParserJson();
        renameFiles(parse.fromJSON());
        LOGGER.info("Program is end");
    }
}
