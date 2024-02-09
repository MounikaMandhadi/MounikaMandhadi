package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageOfSquaresTest {

    @Test
    public void testFindAverageOfSquaresOfOddNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expectedAverage = 21.0; // (1^2 + 3^2 + 5^2 + 7^2) / 4 = 16.0
        double actualAverage = AverageOfSquares.findAverageOfSquaresOfOddNumbers(numbers);

        assertEquals(expectedAverage, actualAverage, 0.001); // Allow for a small tolerance (delta) in the comparison
    }

    @Test
    public void testFindAverageOfSquaresOfOddNumbersEmptyArray() {
        int[] numbers = {};
        double expectedAverage = 0.0; // Empty array should return 0.0
        double actualAverage = AverageOfSquares.findAverageOfSquaresOfOddNumbers(numbers);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testFindAverageOfSquaresOfOddNumbersNoOddNumbers() {
        int[] numbers = {2, 4, 6, 8};
        double expectedAverage = 0.0; // No odd numbers in the array should return 0.0
        double actualAverage = AverageOfSquares.findAverageOfSquaresOfOddNumbers(numbers);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testFindAverageOfSquaresOfOddNumbersAllOddNumbers() {
        int[] numbers = {1, 3, 5, 7};
        double expectedAverage = 21.0; // (1^2 + 3^2 + 5^2 + 7^2) / 4 = 16.0
        double actualAverage = AverageOfSquares.findAverageOfSquaresOfOddNumbers(numbers);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }
}
