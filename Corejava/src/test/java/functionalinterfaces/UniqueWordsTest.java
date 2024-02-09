package functionalinterfaces;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordsTest {

    @Test
    public void testCountUniqueWords() {
        String input = "hello world hello java world this is a java program";
        Map<String, Integer> wordCountMap = UniqueWords.countUniqueWords(input);

        // Test case 1: "Hello" appears twice
        assertEquals(2, wordCountMap.get("hello"));

        // Test case 2: "world" appears twice
        assertEquals(2, wordCountMap.get("world"));

        // Test case 3: "Java" appears twice
        assertEquals(2, wordCountMap.get("java"));

        // Test case 4: "This", "is", "a", "program." appear once
        assertEquals(1, wordCountMap.get("this"));
        assertEquals(1, wordCountMap.get("is"));
        assertEquals(1, wordCountMap.get("a"));
        assertEquals(1, wordCountMap.get("program"));

        // Test case 5: Non-existing word should return null
        assertEquals(null, wordCountMap.get("nonexistent"));
    }
}
