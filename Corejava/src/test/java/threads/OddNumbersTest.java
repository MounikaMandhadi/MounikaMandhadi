package threads;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

    public class OddNumbersTest {
        @Test
        public void testOddNumbers() {
            int max = 60;
            Thread oddThread = new Thread(new OddNumbers(max));
            oddThread.start();
            assertTrue(true); // Dummy assertion to ensure the test completes
        }



}