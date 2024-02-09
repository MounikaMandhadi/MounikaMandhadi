package functionalinterfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListTest {

    @Test
    public void testReverseArrayList() {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reverse the ArrayList
        Collections.reverse(list);

        // Create an ArrayList with the expected reversed order
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        // Check if the reversed ArrayList matches the expected result
        assertEquals(expected, list);
    }

    @Test
    public void testReverseEmptyArrayList() {
        // Create an empty ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Reverse the empty ArrayList
        Collections.reverse(list);

        // Check if the reversed ArrayList is still empty
        assertTrue(list.isEmpty());
    }
}
