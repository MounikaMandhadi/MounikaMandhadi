package lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> resultList = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedList, resultList);
    }

    @Test
    public void testRemoveDuplicatesEmptyList() {
        List<Integer> inputList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();

        List<Integer> resultList = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedList, resultList);
    }

    @Test
    public void testRemoveDuplicatesNullList() {
        List<Integer> inputList = null;
        List<Integer> expectedList = new ArrayList<>();

        List<Integer> resultList = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedList, resultList);
    }
}
