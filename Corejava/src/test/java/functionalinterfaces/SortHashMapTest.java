package functionalinterfaces;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SortHashMapTest {

    @Test
    public void testSortHashMap() {
        // Create an unsorted HashMap
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Cherry", 8);
        unsortedMap.put("Date", 3);
        unsortedMap.put("Fig", 1);

        // Sort the HashMap
        LinkedHashMap<String, Integer> sortedMap = (LinkedHashMap<String, Integer>) SortHashMap.sortHashMap(unsortedMap);

        // Create an array of keys in sorted order
        String[] expectedKeys = {"Fig", "Banana", "Date", "Apple", "Cherry"};

        // Check if the keys are in the expected order
        int i = 0;
        for (String key : sortedMap.keySet()) {
            assertEquals(expectedKeys[i], key);
            i++;
        }
    }
}
