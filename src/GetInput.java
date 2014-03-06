import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by mslennon on 3/6/14.
 */
public class GetInput {
    private final BufferedReader reader;
    public GetInput(BufferedReader reader) {
        this.reader = reader;
    }

    public String returnUserInput() throws IOException {
        return reader.readLine();

        }
}
