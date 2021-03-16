import java.net.URISyntaxException;
import java.util.Scanner;

public class JSONRunner {
    public static void main(String[] args) throws URISyntaxException {
        Configuration configuration = new Configuration();
        configuration.createFilesInJava();
        configuration.fromJSON();
        System.out.println( configuration
                .checkTheFiles(configuration.createFilesInJava(), configuration.fromJSON()));


    }
}
