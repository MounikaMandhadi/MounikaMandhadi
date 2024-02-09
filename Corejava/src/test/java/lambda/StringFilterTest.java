package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> inputList = Arrays.asList("Apple", "Banana", "Cherry", "apricot", "Grapes");
        List<String> expectedList = Arrays.asList("Apple", "apricot");

        List<String> filteredList = StringFilter.filterStringsStartingWithA(inputList);

        assertEquals(expectedList, filteredList);
    }

    @Test
    public void testFilterStringsStartingWithANoMatches() {
        List<String> inputList = Arrays.asList("Banana", "Cherry", "Grapes");
        List<String> expectedList = Arrays.asList();

        List<String> filteredList = StringFilter.filterStringsStartingWithA(inputList);

        assertEquals(expectedList, filteredList);
    }

    @Test
    public void testFilterStringsStartingWithAEmptyList() {
        List<String> inputList = Arrays.asList();
        List<String> expectedList = Arrays.asList();

        List<String> filteredList = StringFilter.filterStringsStartingWithA(inputList);

        assertEquals(expectedList, filteredList);
    }
}
