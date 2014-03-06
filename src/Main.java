import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by mslennon on 3/6/14.
 */

class Main {
    public static void main(String[]args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        GameRunner gamerunner = new GameRunner(System.out, in);
        gamerunner.go();
    }
}
