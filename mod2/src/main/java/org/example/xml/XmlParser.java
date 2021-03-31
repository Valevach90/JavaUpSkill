package org.example.xml;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class XmlParser {
    private static final Logger LOGGER = Logger.getLogger(XmlParser.class.getName());

    public NodeList fromXML() {
        NodeList rootChilds = null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        Reader reader;
        try (InputStream resourceAsStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("config.xml")) {
            reader = new InputStreamReader(resourceAsStream, "UTF-8");
            doc = dbf.newDocumentBuilder().parse(resourceAsStream);
            Node rootNode = doc.getFirstChild();
            rootChilds = rootNode.getChildNodes();
            LOGGER.info("configuration data is read");
        } catch (IOException | ParserConfigurationException | SAXException e) {
            LOGGER.error("error has caught", e);
            e.printStackTrace();
        }
        return rootChilds;
    }

    public String parseFirstChildTag(NodeList nodeList) {
        String tagName = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (nodeList.item(i).getNodeName()) {
                case "name": {
                    tagName = nodeList.item(i).getTextContent();
                }
            }
        }
        return tagName;
    }
    public List<Node> parseSecondChildTag(NodeList nodeList){
        List<Node> fileNames = new ArrayList<>();
        for(int i = 0;i<nodeList.getLength();i++){
            if (nodeList.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (nodeList.item(i).getNodeName()) {
                case "fileName": {
                    fileNames.add(nodeList.item(i));
                }
            }
        }
        return fileNames;
    }
    public List<String>getLastTagName(Node nodeList){
        List<String>lastNameElement = new ArrayList<>();
        NodeList lastNames = nodeList.getChildNodes();
        for(int i = 0;i<lastNames.getLength();i++){
            if (lastNames.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if(!lastNames.item(i).getNodeName().equals("fileName")){
                continue;
            }
            NodeList elementsChild = lastNames.item(i).getChildNodes();
            for(int j = 0;j<elementsChild.getLength();j++){
                lastNameElement.add(elementsChild.item(i).getTextContent());
            }
        }
        return lastNameElement;
    }
}
