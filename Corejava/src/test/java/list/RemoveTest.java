package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveTest {

    private List<String> arr1;

    @BeforeEach
    public void setUp() {
        arr1 = Remove.createList();
    }

    @Test
    public void testRemoveElement() {
        boolean result = arr1.remove(new String("E"));
        assertEquals(true, result);
        assertEquals(4, arr1.size());
        assertEquals(false, arr1.contains("E"));
    }
}
