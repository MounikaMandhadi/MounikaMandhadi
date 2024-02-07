package exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import exception.StringToIntegerConversion;
import org.junit.jupiter.api.Test;

public class StringToIntegerConversionTest {

    @Test
    public void testValidInputConversion() {
        String input = "23";
        int result = StringToIntegerConversion.convertToInt(input);
        assertEquals(23, result);
    }

    @Test
    public void testDecimalInputConversion() {
        String input = "45.67";
        assertThrows(NumberFormatException.class, () -> {
            StringToIntegerConversion.convertToInt(input);
        });
    }

    @Test
    public void testNonNumericInputConversion() {
        String input = "test";
        assertThrows(NumberFormatException.class, () -> {
            StringToIntegerConversion.convertToInt(input);
        });
    }

    @Test
    public void testAlphanumericInputConversion() {
        String input = "123f";
        assertThrows(NumberFormatException.class, () -> {
            StringToIntegerConversion.convertToInt(input);
        });
    }
}
