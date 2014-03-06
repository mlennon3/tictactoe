import java.io.*;
import java.nio.Buffer;

/**
 * Created by mslennon on 3/6/14.
 */

class Main {
    public static void main(String[]args) throws IOException {
        Board board = new Board();
        GetInput in = new GetInput(new BufferedReader(new InputStreamReader(System.in)));
        GameRunner gamerunner = new GameRunner(System.out, in, board);
        gamerunner.go();
    }
}
