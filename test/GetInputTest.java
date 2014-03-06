import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
        getInput.returnUserInput();
        assertEquals(getInput.returnUserInput(), "1");

    }

    @Test
    public void shouldRePromptWhenGettingBadInput() throws IOException {
        when(reader.readLine()).thenReturn("adfadsf").thenReturn("0").thenReturn("1");
        getInput.returnUserInput();
        verify(reader, times(3)).readLine();
    }



}
