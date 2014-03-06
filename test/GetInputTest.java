import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mslennon on 3/6/14.
 */

public class GetInputTest {
    private BufferedReader reader;
    private GetInput getInput;

    @Before
    public void setUp() throws Exception {
        reader = mock(BufferedReader.class);
        this.getInput = new GetInput(reader);
    }

    @Test
    public void shouldGetUserMove() throws IOException {
        when(reader.readLine()).thenReturn("1");
        assertEquals(getInput.returnUserInput(), "1");

    }

}
