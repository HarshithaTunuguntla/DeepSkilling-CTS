import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J_LoggingExercise {

    private static final Logger logger = LoggerFactory.getLogger(SLF4J_LoggingExercise.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Error occurred: Division by zero!", e);
        }

        logger.warn("This is a warning message.");
        logger.info("Application finished.");
    }
}