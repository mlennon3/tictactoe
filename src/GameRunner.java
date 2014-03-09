import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by mslennon on 3/6/14.
 */
public class GameRunner {

//    public String board;
    private final PrintStream stream;
    private final GetInput in;
    private final Board board;

    public GameRunner(PrintStream stream, GetInput in, Board board) {
        this.stream = stream;
        this.in = in;
        this.board = board;
    }


    public void go() throws IOException {
        board.printBoard();
        tellBoardNextMove();
        board.printBoard();
    }

    private void tellBoardNextMove() throws IOException {
        String currentMove = getUserMove();
        board.receiveMove(currentMove);
    }


    private String getUserMove() throws IOException {
        stream.println("Please Choose A Number 1-9");
        return in.returnUserInput();
    }

}
