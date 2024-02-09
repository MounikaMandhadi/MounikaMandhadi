package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumOfSquaresTest {

    @Test
    public void testCalculateSumOfSquares() {
        List<Integer> numberList = List.of(1, 2, 3, -4, 5, -6, 7, 8);
        int expectedSum = 1 + 4 + 9 + 25 + 49 + 64; // Sum of squares of positive integers
        int actualSum = SumOfSquares.calculateSumOfSquares(numberList);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumOfSquaresEmptyList() {
        List<Integer> numberList = List.of();
        int expectedSum = 0; // Empty list should return 0
        int actualSum = SumOfSquares.calculateSumOfSquares(numberList);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumOfSquaresNullList() {
        List<Integer> numberList = null;
        int expectedSum = 0; // Null list should return 0
        int actualSum = SumOfSquares.calculateSumOfSquares(numberList);

        assertEquals(expectedSum, actualSum);
    }
}
