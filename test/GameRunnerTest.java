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
    player1 = new Player("X", "Player 1");
    player2 = new Player("O", "Player 2");
    runner = new GameRunner(stream, in, board, player1, player2);



    }


    @Test
    public void shouldTakeMoveFromGetInputAndPassItToBoard() throws IOException {
        when(in.returnUserInput()).thenReturn(1);
        when(board.isEmptySpace(1)).thenReturn(true);
        when(board.isFull()).thenReturn(false).thenReturn(true);

        runner.go();

        verify(board).receiveMove(1, "X");

    }

    @Test
    public void shouldTakeMoveFromSecondPlayerAndPassItToBoard() throws IOException{
        when(in.returnUserInput()).thenReturn(1).thenReturn(2);
        when(board.isEmptySpace(2)).thenReturn(true);
        when(board.isFull()).thenReturn(false).thenReturn(false).thenReturn(true);

        runner.go();

        verify(board).receiveMove(2, "O");

    }

    @Test
    public void shouldPromptPlayer1ToMove() throws IOException {
        when(board.isEmptySpace(1)).thenReturn(true).thenReturn(true);
        when(board.isFull()).thenReturn(false).thenReturn(true);
        when(in.returnUserInput()).thenReturn(1);
        runner.go();
        verify(stream).println("Player 1 please go");
    }

    @Test
    public void shouldPromptPlayer2ToMove() throws  IOException {
        when(in.returnUserInput()).thenReturn(1);
        when(board.isEmptySpace(1)).thenReturn(true);
        when(board.isFull()).thenReturn(false).thenReturn(false).thenReturn(true);


        runner.go();

        verify(stream).println("Player 2 please go");
    }


    @Test
    public void shouldDisplayLocationAlreadyTaken() throws IOException {
        when(in.returnUserInput()).thenReturn(1);
        when(board.isEmptySpace(1)).thenReturn(false).thenReturn(true);
        when(board.isFull()).thenReturn(false).thenReturn(true);


        runner.go();

        verify(stream).println("Location Already Taken");
    }

    @Test
    public void shouldPlayUntilBoardIsFull() throws IOException {
        when(board.isFull()).thenReturn(true);
        runner.go();
        verify(stream).println("Game is a draw");
    }

}


