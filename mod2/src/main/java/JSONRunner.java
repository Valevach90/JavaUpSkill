import java.util.Scanner;

public class JSONRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемое значения для переименовывания");
        String rename = scanner.next();
        ParserJson parser = new ParserJson();
        parser.toJson(parser.renameFile(rename, parser.fromJSON()));
        parser.printValue();


    }
}
