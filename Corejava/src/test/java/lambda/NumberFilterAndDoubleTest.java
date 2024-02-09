package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class NumberFilterAndDoubleTest {

    @Test
    public void testFilterAndDouble() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectedList = Arrays.asList(2, 6, 10); // (1*2), (3*2), (5*2)

        List<Integer> resultList = NumberFilterAndDouble.filterAndDouble(inputList);

        assertEquals(expectedList, resultList);
    }

    @Test
    public void testFilterAndDoubleEmptyList() {
        List<Integer> inputList = Arrays.asList();
        List<Integer> expectedList = Arrays.asList();

        List<Integer> resultList = NumberFilterAndDouble.filterAndDouble(inputList);

        assertEquals(expectedList, resultList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterAndDoubleNullList() {
        NumberFilterAndDouble.filterAndDouble(null); // Should throw IllegalArgumentException
    }
}
