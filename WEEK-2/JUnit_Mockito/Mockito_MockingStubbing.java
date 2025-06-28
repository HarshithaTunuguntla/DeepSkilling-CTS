import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class Mockito_MockingStubbing {

    @Test
    public void testMockingAndStubbing() {
        List<String> mockList = mock(List.class);

        when(mockList.get(0)).thenReturn("Hello Mockito");

        assertEquals("Hello Mockito", mockList.get(0));
        assertNull(mockList.get(1));
    }
}