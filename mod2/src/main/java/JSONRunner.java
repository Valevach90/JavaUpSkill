import org.json.simple.parser.ParseException;

public class JSONRunner {
    public static void main(String[] args) throws ParseException {
        ParserJson parser = new ParserJson();
        Root root = parser.parser();
        System.out.println(root.toString());
    }
}
