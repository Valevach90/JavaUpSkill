import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Configuration {
    private String suffix;
    private List<FileInfo> files;

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
        List<File> checkedFiles = new ArrayList<>();
        files.add(file1);
        files.add(file2);
        files.add(file3);
        return files;
    }

    public boolean checkTheFiles(List<File> files, Configuration config) {
        ArrayList <FileInfo> fileInfos = new ArrayList<>(config.getFiles());
        for (FileInfo file : fileInfos) {
            for (int i = 0; i < files.size(); i++) {
                if (file.getFileName().equals(files.get(i).getName())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }






public String getSuffix(){
        return suffix;
        }

public List<FileInfo> getFiles(){
        return files;
        }

@Override
public String toString(){
        return"Configuration{"+
        "suffix='"+suffix+'\''+
        ", files="+files+
        '}';
        }
        }
