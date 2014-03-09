import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by mslennon on 3/6/14.
 */
public class Board {
    private PrintStream stream;
    private String board;
    private ArrayList tokens;

    public Board(PrintStream stream, ArrayList<String> tokens) {
        this.stream = stream;
        this.tokens = tokens;
    }


    public void receiveMove(Integer move, String piece) {
        tokens.set(move-1, piece);

    }

    public void printBoard() {
        stream.println(" " +tokens.get(0) + "| " + tokens.get(1) + "| " + tokens.get(2) + "\n" +
                                 "--------" + "\n" +
                       " " +tokens.get(3) + "| " + tokens.get(4) + "| " + tokens.get(5) + "\n" +
                                 "--------" + "\n" +
                       " " +tokens.get(6) + "| " + tokens.get(7) + "| " + tokens.get(8));
    }

}
