
import com.google.gson.*;
import org.json.simple.parser.JSONParser;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ParserJson {
    public String oldFileName = null;
    public String newFileName = null;

    public MyFiles fromJSON() {
        MyFiles fileName = null;
        try {
            File file = new File("src/main/resources/test2.json");
            FileReader reader = new FileReader(file);
            Gson gson = new Gson();
            fileName = gson.fromJson(reader, MyFiles.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public MyFiles renameFile(String rename, MyFiles file) {
        oldFileName = file.getFileName();
        newFileName = rename + file.getFileName();
        file.setFileName(newFileName);
        return file;
    }

    public void toJson(MyFiles files) {
        try {
            File file = new File("src/main/resources/test2.json");
            Gson gson = new Gson();
            FileWriter writer = new FileWriter(file);
            String toJson = gson.toJson(files);
            writer.write(toJson);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printValue() {
        System.out.println(oldFileName + " > " + newFileName);
    }
}
