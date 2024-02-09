package functionalinterfaces;

import static org.junit.Assert.*;

import list.SumArray;
import org.junit.Test;

public class SumArrayTest {

    @Test
    public void testCalculateSum() {
        int[] array = {1, 2, 3, 4, 5};

        int sum = SumArray.calculateSum(array);

        // The sum of elements in the array is 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(15, sum);
    }

    @Test
    public void testCalculateSumEmptyArray() {
        int[] array = {};

        int sum = SumArray.calculateSum(array);

        // The sum of elements in an empty array should be 0
        assertEquals(0, sum);
    }

    @Test
    public void testCalculateSumNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};

        int sum = SumArray.calculateSum(array);

        // The sum of negative numbers is (-1) + (-2) + (-3) + (-4) + (-5) = -15
        assertEquals(-15, sum);
    }
}
