package lambda;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VowelStringsTest {

    @Test
    public void testPrintVowelStrings() {
        String[] stringArray = {"hello", "world", "java", "programming"};

        // Redirect the standard output to capture printed messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        VowelStrings.printVowelStrings(stringArray);

        // Restore the standard output
        System.setOut(System.out);

        // Check the captured output
        String expectedOutput = "String: hello\nVowels: eo (2 vowels)\nString: world\nVowels: o (1 vowels)\nString: java\nVowels: a (1 vowels)\nString: programming\nVowels: oai (3 vowels)\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
