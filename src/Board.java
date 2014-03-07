import java.io.PrintStream;
import java.util.HashMap;

/**
 * Created by mslennon on 3/6/14.
 */
public class Board {
    private PrintStream stream;
    private HashMap moveToBoardIndex;
    private String board;

    public Board(PrintStream stream) {
        this.stream = stream;
        this.board = ("_|_|_\n"+
                     "_|_|_\n"+
                     " | | \n");
        this.moveToBoardIndex = new HashMap<String, Integer>() {{
            put("1", 0);
            put("2", 2);
            put("3", 4);
            put("4", 6);
            put("5", 8);
            put("6", 10);
            put("7", 12);
            put("8", 14);
            put("9", 16);
        }};
    }


    public void receiveMove(String move) {
        Integer boardIndex = convertMoveToBoardIndex(move);
        char[] boardChars = board.toCharArray();
        boardChars[boardIndex] = 'X';
        this.board = String.valueOf(boardChars);
        printBoard();

    }

    public void printBoard() {
        stream.println(board);
    }

    public Integer convertMoveToBoardIndex(String move) {
        Integer boardIndex = (Integer) moveToBoardIndex.get(move);
        return boardIndex;



    }
}
