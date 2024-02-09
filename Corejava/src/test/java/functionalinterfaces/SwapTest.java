package functionalinterfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


    public class SwapTest {

        @Test
        public void testSwapWithPositiveNumbers() {
            int x = 10;
            int y = 5;

            Swap.swapNumbers(x, y);

            assertEquals(10, x);
            assertEquals(5, y);
        }

        @Test
        public void testSwapWithNegativeNumbers() {
            int x = -3;
            int y = -7;

            Swap.swapNumbers(x, y);

            assertEquals(-7, x);
            assertEquals(-3, y);
        }

        @Test
        public void testSwapWithZero() {
            int x = 0;
            int y = 15;

            Swap.swapNumbers(x, y);

            assertEquals(15, x);
            assertEquals(0, y);
        }
    }


