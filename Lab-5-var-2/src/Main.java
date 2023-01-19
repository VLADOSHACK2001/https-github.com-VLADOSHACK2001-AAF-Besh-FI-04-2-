import Commands.Utils.JSON.ParserJson;
import java.io.IOException;

/**
 *  Main class приложения
 */

public class Main {
    public static void main(String[] args) throws IOException {
        ParserJson.fromJsonToCollection();
        ConsoleManager consoleManager = new ConsoleManager();
        consoleManager.startInteractiveMode();
    }
}
