package list;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GPATest {

    @Test
    public void testGPAProcessing() {
        // Redirect the standard output to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the GPA processing
        GPA.main(new String[0]);

        // Get the printed output
        String printedOutput = outputStream.toString();

        // Restore the original standard output
        System.setOut(originalOut);

        // Check if the output contains the expected text
        assertTrue(printedOutput.contains("Students with GPA >= "));
        assertTrue(printedOutput.contains("John Doe - GPA: 3.5"));
        assertTrue(printedOutput.contains("Bob Johnson - GPA: 3.8"));
        assertTrue(printedOutput.contains("Emily Davis - GPA: 3.9"));
        assertFalse(printedOutput.contains("Alice Smith - GPA: 3.2"));
    }
}
