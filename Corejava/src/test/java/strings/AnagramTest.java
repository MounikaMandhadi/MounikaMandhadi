package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void testAreAnagrams() {
        assertTrue(Anagram.areAnagrams("listen", "silent"));
        assertTrue(Anagram.areAnagrams("heart", "earth"));
        assertFalse(Anagram.areAnagrams("hello", "world"));
        assertFalse(Anagram.areAnagrams("apple", "banana"));
    }
}

