import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> tokens = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            tokens.add(" ");
        }

        Player player1 = new Player("X", "Player 1");
        Player player2 = new Player("O", "Player 2");

        Board board = new Board(System.out, tokens);
        GetInput in = new GetInput(new BufferedReader(new InputStreamReader(System.in)));
        GameRunner gamerunner = new GameRunner(System.out, in, board, player1, player2);

        gamerunner.go();
    }
}