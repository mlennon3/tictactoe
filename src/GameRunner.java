import java.io.BufferedReader;
import java.io.PrintStream;

/**
 * Created by mslennon on 3/6/14.
 */
public class GameRunner {

//    public static  board;
    private final PrintStream stream;
    private final BufferedReader reader;

    public GameRunner(PrintStream stream, BufferedReader reader) {
        this.stream = stream;
        this.reader = reader;
    }

    public void go() {
        printEmptyBoard();
        promptForMove();
    }

    private void promptForMove() {
        stream.println("Please Choose A Number 1-9");
    }

    private void printEmptyBoard() {
        stream.println( "_|_|_\n"+
                "_|_|_\n"+
                " | | \n");
    }
}
