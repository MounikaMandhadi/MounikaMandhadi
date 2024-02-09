package functionalinterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @org.junit.Test
    public void testIsPalindromeForPalindromeString() {
        assertTrue(Palindrome.isPalindrome("level"));
    }

    @Test
    public void testIsPalindromeForNonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeForEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeForSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testIsPalindromeForPalindromeNumber() {
        assertTrue(Palindrome.isPalindrome("121"));
    }

    @Test
    public void testIsPalindromeForNonPalindromeNumber() {
        assertFalse(Palindrome.isPalindrome("12345"));
    }
}
