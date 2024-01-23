package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VowelsTest {

    @Test
    void testIsVowel() {
        assertTrue(Vowels.isVowel('a'));
        assertTrue(Vowels.isVowel('E'));
        assertTrue(Vowels.isVowel('i'));
        assertTrue(Vowels.isVowel('O'));
        assertTrue(Vowels.isVowel('u'));

        assertFalse(Vowels.isVowel('b'));
        assertFalse(Vowels.isVowel('x'));
        assertFalse(Vowels.isVowel('1'));
        assertFalse(Vowels.isVowel('@'));
    }
}
