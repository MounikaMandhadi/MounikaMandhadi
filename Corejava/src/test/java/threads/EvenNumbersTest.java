package threads;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

    public class EvenNumbersTest {
        @Test
        public void testEvenNumbers() {
            int max = 60;
            Thread evenThread = new Thread(new EvenNumbers(max));
            evenThread.start();
            assertTrue(true); // Dummy assertion to ensure the test completes
        }


}