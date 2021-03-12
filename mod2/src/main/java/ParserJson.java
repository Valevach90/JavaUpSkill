
import org.json.simple.parser.JSONParser;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParserJson {
    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";


    public Root parser() throws ParseException {
        String suffix = "111";
        Root root = new Root();
        JSONParser parser = new JSONParser();
        try (FileReader read = new FileReader("src/main/resources/test.json")) {
            JSONObject jObject = (JSONObject) parser.parse(read);

            JSONArray peopleArray = (JSONArray) jObject.get(TAG_PEOPLE);
            String newName = null;
            List<People> peoples = new ArrayList<>();
            for (Object people : peopleArray) {
                JSONObject peopleToJSONObject = (JSONObject) people;
                String peopleName = (String) peopleArray.get(Integer.parseInt((TAG_NAME)));
                newName = suffix + peopleName;
                int age = (Integer) jObject.get(TAG_AGE);
                People newPeople = new People(newName, age);
                peoples.add(newPeople);
            }
            root.setPeople(peoples);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }

}
