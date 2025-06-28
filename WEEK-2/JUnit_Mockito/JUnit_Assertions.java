import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnit_Assertions {

    @Test
    public void testEqual() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testTrue() {
        assertTrue(10 > 5);
    }

    @Test
    public void testNotNull() {
        String str = "Hello";
        assertNotNull(str);
    }
}