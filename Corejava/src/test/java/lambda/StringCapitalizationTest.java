package lambda;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

public class StringCapitalizationTest {

    @Test
    public void testCapitalizeAndSort() {
        // Input array of lowercase fruit names
        String[] inputArray = {"apple", "banana", "cherry", "date", "fig"};

        // Expected result after capitalization and sorting
        String[] expectedArray = {"Apple", "Banana", "Cherry", "Date", "Fig"};

        // Call the capitalizeAndSort method to process the input array
        String[] resultArray = StringCapitalization.capitalizeAndSort(inputArray);

        // Use assertArrayEquals to compare the expected result with the actual result
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testCapitalizeAndSortEmptyArray() {
        // Input an empty array
        String[] inputArray = {};

        // Call the capitalizeAndSort method to process the input array
        String[] resultArray = StringCapitalization.capitalizeAndSort(inputArray);

        // Assert that the result is also an empty array
        assertArrayEquals(new String[0], resultArray);
    }

    @Test
    public void testCapitalizeAndSortNullArray() {
        // Input a null array
        String[] inputArray = null;

        // Call the capitalizeAndSort method to process the input array
        String[] resultArray = StringCapitalization.capitalizeAndSort(inputArray);

        // Assert that the result is also null
        assertNull(resultArray);
    }
}
