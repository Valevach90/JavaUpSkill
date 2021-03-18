package org.example;

import java.net.URISyntaxException;


public class JSONRunner {
    public static void main(String[] args) {
        ParserJson parse = new ParserJson();
        try {
            parse.renameFiles(parse.fromJSON());
        } catch (URISyntaxException e) {
            e.getMessage();
        }



    }
}
