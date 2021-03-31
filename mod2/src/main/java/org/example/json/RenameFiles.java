package org.example.json;

import org.apache.log4j.Logger;

import java.io.File;

public class RenameFiles {
    private static final Logger LOGGER = Logger.getLogger(RenameFiles.class.getName());
    public static void renameFiles(Configuration config) {
        for (FileInfo files : config.getFiles()) {
            File oldFile = new File(files.getFileName());
            if (oldFile.exists()) {
                String newFileName = oldFile.getParent() + config.getSuffix() + oldFile.getName();
                File newFile = new File(newFileName);
                oldFile.renameTo(newFile);
                System.out.println(files.getFileName() + " > " + newFileName);
                LOGGER.info("files are renamed");
            } else {
                LOGGER.info("files "+files.getFileName()+ " are not renamed");
                System.out.println("File " + files.getFileName() + " is not found");
            }
        }
    }
}
