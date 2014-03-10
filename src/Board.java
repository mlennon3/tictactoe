import java.io.PrintStream;
import java.util.ArrayList;


public class Board {
    private PrintStream stream;
    private ArrayList<String> tokens;

    public Board(PrintStream stream, ArrayList<String> tokens) {
        this.stream = stream;
        this.tokens = tokens;
    }


    public boolean receiveMove(Integer move, String piece) {
        if (this.isEmptySpace(move)) {
            tokens.set(move - 1, piece);
            return true;
        }
        else {
            stream.println("Location Already Taken");
            return false;
        }
    }

    public boolean isEmptySpace(Integer move) {
        return tokens.get(move - 1).equals(" ");
    }

    public void printBoard() {
        stream.println(" " + tokens.get(0) + "| " + tokens.get(1) + "| " + tokens.get(2) + "\n" +
                "--------" + "\n" +
                " " + tokens.get(3) + "| " + tokens.get(4) + "| " + tokens.get(5) + "\n" +
                "--------" + "\n" +
                " " + tokens.get(6) + "| " + tokens.get(7) + "| " + tokens.get(8));
    }

    public boolean isFull() {
        for (Object token : tokens) {
            if (token == " ") {
                return false;

            }

        }
        return true;
    }
}
