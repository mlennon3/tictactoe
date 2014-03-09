import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by mslennon on 3/6/14.
 */

class Main {
    public static void main(String[]args) throws IOException {
        ArrayList tokens = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            tokens.add(" ");
        }

        Player player1 = new Player("X");
        Player player2 = new Player("O");

        Board board = new Board(System.out, tokens);
        GetInput in = new GetInput(new BufferedReader(new InputStreamReader(System.in)));
        GameRunner gamerunner = new GameRunner(System.out, in, board, player1, player2);
        gamerunner.go();
    }
}
