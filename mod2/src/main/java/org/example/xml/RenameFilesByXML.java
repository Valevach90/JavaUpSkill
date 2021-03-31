package org.example.xml;

import org.apache.log4j.Logger;
import org.w3c.dom.NodeList;

import java.io.File;

public class RenameFilesByXML {
    private static final Logger LOGGER = Logger.getLogger(RenameFilesByXML.class.getName());
    public static void renameFilesByXML(NodeList config) {
        for (int i = 0;i<config.getLength();i++) {
            File oldFile = new File(config.item(i).getTextContent());
            if (oldFile.exists()) {
                String newFileName = oldFile.getParent() + config.item(i).getTextContent() + oldFile.getName();
                File newFile = new File(newFileName);
                oldFile.renameTo(newFile);
                System.out.println(config.item(i).getTextContent() + " > " + newFileName);
                //LOGGER.info("files are renamed");
            } else {
                //LOGGER.info("files "+files.getFileName()+ " are not renamed");
                System.out.println("File " + config.item(i).getTextContent() + " is not found");
            }
        }
    }
}
