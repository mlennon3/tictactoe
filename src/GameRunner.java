import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by mslennon on 3/6/14.
 */
public class GameRunner {

    private final PrintStream stream;
    private final GetInput in;
    private final Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GameRunner(PrintStream stream, GetInput in, Board board, Player player1, Player player2) {
        this.stream = stream;
        this.in = in;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }


    public void go() throws IOException {
        gameLoop();
    }

    private void gameLoop() throws  IOException {
        board.printBoard();
        tellBoardNextMove();
        board.printBoard();
    }

    private void tellBoardNextMove() throws IOException {
        Integer currentMove = getUserMove();
        board.receiveMove(currentMove, "X");
    }


    private Integer getUserMove() throws IOException {
        stream.println("Please Choose A Number 1-9");
        return in.returnUserInput();
    }

}
