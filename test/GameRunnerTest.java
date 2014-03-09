import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by mslennon on 3/6/14.
 */


public class GameRunnerTest {
    private GameRunner runner;
    private PrintStream stream;
    private GetInput in;
    private Board board;
    private Player player1;
    private Player player2;


    @Before
    public void setUp() throws Exception {
    stream  = mock(PrintStream.class);
    in = mock(GetInput.class);
    board = mock(Board.class);
    player1 = mock(Player.class);
    player2 = mock(Player.class);
    runner = new GameRunner(stream, in, board, player1, player2);



    }


    @Test
    public void shouldTakeMoveFromGetInputAndPassItToBoard() throws IOException {
        when(in.returnUserInput()).thenReturn(1);

        runner.go();

        verify(board).receiveMove(1, "X");

    }

}
