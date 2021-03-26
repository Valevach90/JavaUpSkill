package src.main.java.org.example;


import static src.main.java.org.example.RenameFiles.renameFiles;

public class JSONRunner {
    public static void main(String[] args) {
        ParserJson parse = new ParserJson();
            renameFiles(parse.fromJSON());
    }
}
