import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Mockito_VerifyingInteractions {

    @Test
    public void testVerifyInteractions() {
        List<String> mockList = mock(List.class);

        mockList.add("One");
        mockList.clear();

        verify(mockList).add("One");
        verify(mockList).clear();
    }
}