
import com.google.gson.*;


import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
Application should read a config file on the startup
Then it should ensure that all of files from the config exist
Then it should rename each file adding a suffix from the config to its name
It should print the results of the renaming like:
old_name -> new_name
 */

public class ParserJson {
    private static final String TAG_SUFFIX = "suffix";
    private static final String TAG_FILES = "files";
    private static final String TAG_FILENAME = "fileName";

    public Configuration fromJSON() throws URISyntaxException {
        Configuration fileName = null;
        try {
            File file = Paths.get(this.getClass()
                    .getClassLoader()
                    .getResource("config.json")
                    .toURI())
                    .toFile();
            FileReader reader = new FileReader(file);
            Gson gson = new Gson();
            fileName = gson.fromJson(reader, Configuration.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public List<File> createFilesInJava() {
        File file1 = new File("C/1.txt");
        File file2 = new File("C/2.txt");
        File file3 = new File("C/3.txt");
        List<File> files = new ArrayList<>();
        files.add(file1);
        files.add(file2);
        files.add(file3);
        return files;
    }

    public boolean checkTheFiles(List<File> files, Configuration config) {
        List<FileInfo> fileInfo = new ArrayList<>(config.getFiles());
        for (File file : files) {
            for (int i = 0; i < fileInfo.size(); i++) {
                if (file.getName().equals(fileInfo.get(i).getFileName())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void addSuffix(Configuration config, List<File> files) {

    }

}
