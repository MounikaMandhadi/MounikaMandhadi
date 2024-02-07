package exception;

public class StringToIntegerConversion {

    public static void convertAndPrint(String input) {
        try {
            int result = convertToInt(input);
            System.out.println("Input: \"" + input + "\", Converted to Integer: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Input: \"" + input + "\", Exception: " + e.getMessage());
        }
    }

    public static int convertToInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}
