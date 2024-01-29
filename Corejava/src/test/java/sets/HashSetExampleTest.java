package sets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashSetExampleTest {

    private HashSet<String> stringHashSet;

    @BeforeEach
    public void setUp() {
        stringHashSet = new HashSet<>();
        stringHashSet.add("One");
        stringHashSet.add("Two");
        stringHashSet.add("Three");
        stringHashSet.add("Four");
        stringHashSet.add("Five");
        stringHashSet.add("Six");
        stringHashSet.add("Seven");
        stringHashSet.add("Eight");
        stringHashSet.add("Nine");
        stringHashSet.add("Ten");
    }

    @Test
    public void testIteratorWithIterator() {
        Iterator<String> iterator = stringHashSet.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        assertEquals(10, count);
    }

    @Test
    public void testIteratorWithForLoop() {
        int count = 0;
        for (String word : stringHashSet) {
            count++;
        }
        assertEquals(10, count);
    }

    @Test
    public void testIteratorWithEnhancedForLoop() {
        int count = 0;
        for (String word : stringHashSet) {
            count++;
        }
        assertEquals(10, count);
    }
}
