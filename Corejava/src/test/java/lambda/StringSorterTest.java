package lambda;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringSorterTest {

    @Test
    public void testSortStrings() {
        String[] inputArray = {"apple", "banana", "cherry", "date", "fig"};
        String[] expectedArray = {"fig", "date", "apple", "cherry", "banana"};

        String[] resultArray = StringSorter.sortStrings(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testSortStringsEmptyArray() {
        String[] inputArray = {};
        String[] expectedArray = {};

        String[] resultArray = StringSorter.sortStrings(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testSortStringsNullArray() {
        String[] inputArray = null;
        String[] expectedArray = {};

        String[] resultArray = StringSorter.sortStrings(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }
}
