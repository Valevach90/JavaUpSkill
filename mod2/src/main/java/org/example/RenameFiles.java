package src.main.java.org.example;

import java.io.File;

public class RenameFiles {
    public static void renameFiles(Configuration config) {
        for (FileInfo files : config.getFiles()) {
            File oldFile = new File(files.getFileName());
            if (oldFile.exists()) {
                String newFileName = oldFile.getParent() + config.getSuffix() + oldFile.getName();
                File newFile = new File(newFileName);
                oldFile.renameTo(newFile);
                System.out.println(files.getFileName() + " > " + newFileName);
            } else {
                System.out.println("File " + files.getFileName() + " is not found");
            }
        }
    }
}
