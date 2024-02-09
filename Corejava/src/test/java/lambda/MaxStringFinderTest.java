package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MaxStringFinderTest {

    @Test
    public void testFindMaxString() {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        String expectedMaxString = "fig";

        String maxString = MaxStringFinder.findMaxString(stringList);

        assertEquals(expectedMaxString, maxString);
    }

    @Test
    public void testFindMaxStringEmptyList() {
        List<String> stringList = Arrays.asList();
        String maxString = MaxStringFinder.findMaxString(stringList);

        assertNull(maxString);
    }

    @Test
    public void testFindMaxStringNullList() {
        List<String> stringList = null;
        String maxString = MaxStringFinder.findMaxString(stringList);

        assertNull(maxString);
    }
}
