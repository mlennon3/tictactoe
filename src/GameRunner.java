import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by mslennon on 3/6/14.
 */
public class GameRunner {

    private final PrintStream stream;
    private final GetInput in;
    private final Board board;
    private Player player1;
    private Player player2;
    private ArrayList<Player> turnOrder = new ArrayList<Player>();

    public GameRunner(PrintStream stream, GetInput in, Board board, Player player1, Player player2) {
        this.stream = stream;
        this.in = in;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.turnOrder.add(player1);
        this.turnOrder.add(player2);
    }


    public void go() throws IOException {
        gameLoop();
    }

    private void gameLoop() throws IOException {
        board.printBoard();
        while (!board.isFull()) {
            Player currentPlayer = turnOrder.remove(0);

            stream.println(currentPlayer.getName() + " please go");

            tellBoardNextMove(currentPlayer.getPiece());

            turnOrder.add(1, currentPlayer);
            board.printBoard();
        }
        stream.println("Game is a draw");

    }

    private void tellBoardNextMove(String piece) throws IOException {
        Integer currentMove = getUserMove();
        while (!board.isEmptySpace(currentMove)) {
            stream.println("Location Already Taken");
            currentMove = getUserMove();
        }
        board.receiveMove(currentMove, piece);
    }


    private Integer getUserMove() throws IOException {
        stream.println("Please Choose A Number 1-9");
        return in.returnUserInput();
    }

}
