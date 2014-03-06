import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static javafx.beans.binding.Bindings.when;
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
    private BufferedReader reader;


    @Before
    public void setUp() throws Exception {
    stream  = mock(PrintStream.class);
    runner = new GameRunner(stream, reader);
    reader = mock(BufferedReader.class);




    }

    @Test
    public void shouldPrintBoard() {
        runner.go();
        verify(stream).println("_|_|_\n" +
                               "_|_|_\n" +
                               " | | \n");

    }

    @Test
    public void shouldPromptUserForMove() {
        runner.go();
        verify(stream).println("Please Choose A Number 1-9");

    }

//    @Test
//    public void shouldRedrawBoardWithChosenX() {
//        runner.go();
//
//        assertEquals(GameRunner.board, [["x","_","_"],["_","_","_"],["_","_","_"]]);
//    }


}
