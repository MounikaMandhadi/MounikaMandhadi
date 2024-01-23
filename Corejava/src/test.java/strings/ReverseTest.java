package strings;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
