package strings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseTest {

    @Test
    public void testReverseWords_successful() {
        String[] input = {"Hello", "World"};
        String[] expectedOutput = {"olleH", "dlroW"};

        String[] result = Reverse.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }
}
