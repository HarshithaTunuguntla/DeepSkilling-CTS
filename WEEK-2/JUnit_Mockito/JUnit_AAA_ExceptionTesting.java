import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnit_AAA_ExceptionTesting {

    @Test
    public void testDivideByZeroException() {
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            int c = a / b;
        });
    }

    @Test
    public void testAAAStyle() {
        int num = 5;
        int result = num * 2;
        assertEquals(10, result);
    }
}