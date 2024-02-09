package functionalinterfaces;

import functionalinterfaces.StringRotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringrotationTest {

    @Test
    public void testIsRotation() {
        // Test case 1: Rotated version of "abcd" is "dabc"
        assertTrue(StringRotation.isRotation("abcd", "dabc"));

        // Test case 2: Rotated version of "hello" is "ohell"
        assertTrue(StringRotation.isRotation("hello", "ohell"));

        // Test case 3: Empty strings are always rotations of each other
        assertTrue(StringRotation.isRotation("", ""));

        // Test case 4: Different lengths, so cannot be rotations
        assertFalse(StringRotation.isRotation("abc", "ab"));

        // Test case 5: Completely different strings
        assertFalse(StringRotation.isRotation("abc", "def"));

        // Test case 7: One null input, cannot be a rotation
        assertFalse(StringRotation.isRotation(null, "abcd"));

        // Test case 8: Both null inputs, cannot be a rotation
        assertFalse(StringRotation.isRotation(null, null));
    }
}
