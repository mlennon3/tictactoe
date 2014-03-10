import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

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

        assertThat(getInput.returnUserInput(), is(1));

    }

    @Test
    public void shouldRePromptWhenGettingBadInput() throws IOException {
        when(reader.readLine()).thenReturn("adfadsf").thenReturn("0").thenReturn("1");

        getInput.returnUserInput();

        verify(reader, times(3)).readLine();
    }


}
