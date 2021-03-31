package org.example;

import org.apache.log4j.Logger;
import org.example.json.ParserJson;
import org.example.xml.XmlParser;
import org.example.xml.RenameFilesByXML;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

import static org.example.json.RenameFiles.renameFiles;

public class Runner {
    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        /*LOGGER.info("Program is running");
        ParserJson parse = new ParserJson();
        renameFiles(parse.fromJSON());
        LOGGER.info("Program is end");*/
        XmlParser xmlParser = new XmlParser();
        NodeList myRoot = xmlParser.fromXML();
        String name = xmlParser.parseFirstChildTag(myRoot);
        System.out.println(name);
        List<Node> list = xmlParser.parseSecondChildTag(myRoot);
        System.out.println(xmlParser.getLastTagName(list));

    }
}
