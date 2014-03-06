import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by mslennon on 3/6/14.
 */


public class GameRunnerTest {
    private GameRunner runner;
    private PrintStream stream;
    private GetInput in;
    private Board board;


    @Before
    public void setUp() throws Exception {
    stream  = mock(PrintStream.class);
    in = mock(GetInput.class);
    board = mock(Board.class);
    runner = new GameRunner(stream, in, board);



    }

    @Test
    public void shouldReturnFirstLineOfBoard() throws IOException {
        runner.go();
        verify(stream).println("_|_|_\n" +
                               "_|_|_\n" +
                               " | | \n");

    }

    @Test
    public void shouldTakeMoveFromGetInputAndPassItToBoard() throws IOException {
        when(in.returnUserInput()).thenReturn("1");

        runner.go();

        verify(board).receiveMove("1");

    }

}
