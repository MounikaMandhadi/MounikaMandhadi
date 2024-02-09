package functionalinterfaces;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterCaseTest {

    @Test
    public void testSwapCase() {
        assertEquals("hELLO wORLD", CharacterCase.swapCase("Hello World"));
        assertEquals("tHIS iS a tEST", CharacterCase.swapCase("This Is A Test"));
        assertEquals("12345", CharacterCase.swapCase("12345"));
        assertEquals("", CharacterCase.swapCase(""));
        assertNull(CharacterCase.swapCase(null));
    }
}
