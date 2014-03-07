import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by mslennon on 3/6/14.
 */
public class BoardTest {
    private Board board;
    private PrintStream stream;


    @Before
    public void setUp() throws Exception {
        stream  = mock(PrintStream.class);
        this.board = new Board(stream);

    }

    @Test
    public void shouldPrintEmptyBoard() throws IOException {
        board.printBoard();
        verify(stream).println("_|_|_\n" +
                               "_|_|_\n" +
                               " | | \n");
    }

    @Test
    public void shouldInsertXIntoBoard() {
        board.receiveMove("1");
        board.printBoard();
        verify(stream).println("X|_|_\n" +
                "_|_|_\n" +
                " | | \n");
    }
}
