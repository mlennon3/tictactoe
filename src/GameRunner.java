import java.io.PrintStream;

/**
 * Created by mslennon on 3/6/14.
 */
public class GameRunner {

    private final PrintStream stream;

    public GameRunner(PrintStream stream) {
        this.stream = stream;
    }

    public void go() {
        printEmptyBoard();
    }

    private void printEmptyBoard() {
        stream.println( "_|_|_\n"+
                "_|_|_\n"+
                " | | \n");
    }
}
