package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperationTest {

    @Test
    public void testAddition() {
        MathOperation addition = (a, b) -> a + b;

        int result = addition.operate(5, 7);

        assertEquals(12, result);
    }

    @Test
    public void testZeroValues() {
        MathOperation addition = (a, b) -> a + b;

        int result = addition.operate(0, 0);

        assertEquals(0, result);
    }

    @Test
    public void testNegativeValues() {
        MathOperation addition = (a, b) -> a + b;

        int result = addition.operate(-5, -3);

        assertEquals(-8, result);
    }
}
