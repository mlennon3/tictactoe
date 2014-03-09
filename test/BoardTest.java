import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by mslennon on 3/6/14.
 */
public class BoardTest {
    private Board board;
    private PrintStream stream;
    private ArrayList<String> tokens;


    @Before
    public void setUp() throws Exception {
        this.tokens = new ArrayList<String>();
        stream  = mock(PrintStream.class);
        this.board = new Board(stream, tokens);

    }

    @Test
    public void shouldPrintEmptyBoard() throws IOException {
        for (int i = 0; i < 9; i++) {
            tokens.add(" ");
        }

        board.printBoard();
        verify(stream).println(" " +tokens.get(0) + "| " + tokens.get(1) + "| " + tokens.get(2) + "\n" +
                "--------" + "\n" +
                " " +tokens.get(3) + "| " + tokens.get(4) + "| " + tokens.get(5) + "\n" +
                "--------" + "\n" +
                " " +tokens.get(6) + "| " + tokens.get(7) + "| " + tokens.get(8));
    }

    @Test
    public void shouldInsertXIntoBoardAt1() {
        for (int i = 0; i < 9; i++) {
            tokens.add(" ");
        }
        board.receiveMove(1, "X");

        assertEquals(tokens.get(0), "X");
    }


    @Test
    public void shouldInsertXIntoBoardAt9() {
        for (int i = 0; i < 9; i++) {
            tokens.add(" ");
        }
        board.receiveMove(9, "X");

        assertEquals(tokens.get(8), "X");

    }


    @Test
    public void shouldInsertOIntoBoardAt5() {
        for (int i = 0; i < 9; i++) {
            tokens.add(" ");
        }
        board.receiveMove(5, "O");

        assertEquals(tokens.get(4), "O");

    }

}