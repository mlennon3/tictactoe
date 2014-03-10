import java.io.BufferedReader;
import java.io.IOException;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class GetInput {
    private final BufferedReader reader;
    private Integer responseInt;
    private String response;

    public GetInput(BufferedReader reader) throws IOException {
        this.reader = reader;
    }


    public Integer returnUserInput() throws IOException {
        response = "0";
        while (!isWithinOneAndNine(response)) {
            response = reader.readLine();

        }
        return Integer.parseInt(response);

    }


    private boolean isWithinOneAndNine(String response) throws IOException {
        if (isNumeric(response)) {
            responseInt = Integer.parseInt(response);
            return (responseInt >= 1 && responseInt <= 9);
        } else {
            return false;
        }
    }
}


