import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by mslennon on 3/6/14.
 */


public class GameRunnerTest {
    private GameRunner runner;
    private PrintStream stream;


    @Before
    public void setUp() throws Exception {
    stream  = mock(PrintStream.class);
    runner = new GameRunner(stream);



    }

    @Test
    public void shouldReturnFirstLineOfBoard() {
        runner.go();
        verify(stream).println("_|_|_\n" +
                               "_|_|_\n" +
                               " | | \n");

    }

}
