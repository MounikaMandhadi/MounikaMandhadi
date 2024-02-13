package sets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        // Test case 1: Removing Duplicates from " java programming"
        String input1 = " java programming";
        String expected1 = " javprogmin";
        assertEquals(expected1, RemoveDuplicates.removeDuplicates(input1));

        // Test case 2: Removing Duplicates from an empty string
        String input2 = "";
        String expected2 = "";
        assertEquals(expected2, RemoveDuplicates.removeDuplicates(input2));

        // Test case 3: Removing Duplicates from "abc def"
        String input3 = "abc def";
        String expected3 = "abc def";
        assertEquals(expected3, RemoveDuplicates.removeDuplicates(input3));

        // Test case 4: Removing Duplicates from "aaaaaaa"
        String input4 = "aaaaaaa";
        String expected4 = "a";
        assertEquals(expected4, RemoveDuplicates.removeDuplicates(input4));

    }
}
