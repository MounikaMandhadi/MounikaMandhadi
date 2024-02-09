package lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringGrouperTest {

    @Test
    public void testGroupStringsByLength() {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        Map<Integer, List<String>> groupedMap = StringGrouper.groupStringsByLength(stringList);

        assertTrue(groupedMap.containsKey(5));
        assertEquals(Arrays.asList("apple", "grape"), groupedMap.get(5));

    }

    @Test
    public void testGroupStringsByLengthEmptyList() {
        List<String> stringList = Arrays.asList();

        Map<Integer, List<String>> groupedMap = StringGrouper.groupStringsByLength(stringList);

        assertTrue(groupedMap.isEmpty());
    }

    @Test
    public void testGroupStringsByLengthNullList() {
        List<String> stringList = null;

        Map<Integer, List<String>> groupedMap = StringGrouper.groupStringsByLength(stringList);

        assertTrue(groupedMap.isEmpty());
    }
}
