import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helpers {
    private static final String TAG_FILES = "files";
    private static final String TAG_FILENAME = "fileName";
    public List<StringBuilder> renameFilesInJSONFile() {
        StringBuilder suffix = new StringBuilder("epam");
        List<StringBuilder> fileNames = new ArrayList<>();
        try {
            FileReader reader = new FileReader("src/main/resources/test.json");

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray array = (JSONArray) jsonObject.get(TAG_FILES);

            Iterator i = array.iterator();
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                String fileNameInJSON = (String) innerObj.get(TAG_FILENAME);
                suffix.append(fileNameInJSON);
                fileNames.add(suffix);
                suffix = new StringBuilder("epam");
            }
        } catch (ParseException | IOException | NullPointerException ex) {
            ex.printStackTrace();
        }
        return fileNames;
    }

    public StringBuilder goodPrint(List<StringBuilder> fileNames) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < fileNames.size(); i++) {
            str.append(fileNames.get(i) + " ");
        }
        return str;
    }

    public void renameFilesAndWriteInJSON(List<StringBuilder> fileNames) {
        try {
            FileReader reader = new FileReader("src/main/resources/test.json");

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray array = (JSONArray) jsonObject.get(TAG_FILES);

            /*Iterator i = array.iterator();
            while (i.hasNext()) {

                JSONObject innerObj = (JSONObject) i.next();
                for (int j = 0; j < fileNames.size(); j++) {
                    //тут не должен быть обьект innerObj!!!,что-то выше
                    innerObj.put(innerObj.get(TAG_FILENAME), fileNames.get(j));
                }
            }*/


        } catch (ParseException | IOException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
