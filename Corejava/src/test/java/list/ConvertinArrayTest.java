package list;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConvertinArrayTest {

    @Test
    public void testArrayListToArrayConversion() {
        // Create an ArrayList of Strings with the same data as in your main class
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");

        // Convert ArrayList to an array of Strings
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);

        // Define the expected array
        String[] expectedArray = {"One", "Two", "Three", "Four"};

        // Assert that the converted array matches the expected array
        assertArrayEquals(expectedArray, stringArray);
    }
}
