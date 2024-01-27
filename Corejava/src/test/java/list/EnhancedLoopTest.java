package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnhancedLoopTest {

    private List<Integer> myList;

    @BeforeEach
    public void setUp() {
        myList = EnhancedLoop.createList();
    }

    @Test
    public void testListSize() {
        assertEquals(4, myList.size());
    }

    @Test
    public void testListContents() {
        assertEquals(1, myList.get(0));
        assertEquals(2, myList.get(1));
        assertEquals(3, myList.get(2));
        assertEquals(4, myList.get(3));
    }
}
