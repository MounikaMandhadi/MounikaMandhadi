package sets;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        String input1 = " java programming";
        String expected1 = " javprogmin";
        assertEquals(expected1, RemoveDuplicates.removeDuplicates(input1));

        String input2 = "";
        String expected2 = "";
        assertEquals(expected2, RemoveDuplicates.removeDuplicates(input2));

        String input3 = "abcdef";
        String expected3 = "abcdef";
        assertEquals(expected3, RemoveDuplicates.removeDuplicates(input3));

        String input4 = "aaaaaaa";
        String expected4 = "a";
        assertEquals(expected4, RemoveDuplicates.removeDuplicates(input4));


    }
}
