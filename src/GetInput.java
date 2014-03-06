import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by mslennon on 3/6/14.
 */
public class GetInput {
    private final BufferedReader reader;
    private Integer responseInt;

    public GetInput(BufferedReader reader) throws IOException {
        this.reader = reader;
    }


    public String returnUserInput() throws IOException {

        String response = reader.readLine();
        try {
            responseInt = Integer.parseInt(response);
            }

        catch (NumberFormatException e){
            responseInt = 0;
            }


        if (isWithinOneAndNine(responseInt)){
            return responseInt.toString();
            }

        else {
            // I want to do something more like
            // else { returnUserInput() } but it needs me to return something
            return "badInput";
            }
        }


    private boolean isWithinOneAndNine(Integer responseInt) throws IOException {
        return (responseInt >= 1 && responseInt <= 9);
}
}

