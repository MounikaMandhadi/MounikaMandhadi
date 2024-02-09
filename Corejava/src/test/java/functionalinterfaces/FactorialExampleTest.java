package functionalinterfaces;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class FactorialExampleTest {

    @Test
    public void testFactorialForPositiveNumber() {
        int number = 5;
        int expectedFactorial = 120;

        int actualFactorial = Factorial.calculateFactorial(number);

        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testFactorialForZero() {
        int number = 0;
        int expectedFactorial = 1;

        int actualFactorial = Factorial.calculateFactorial(number);

        assertEquals(expectedFactorial, actualFactorial);
    }


}