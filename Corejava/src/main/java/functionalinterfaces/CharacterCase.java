package functionalinterfaces;

public class CharacterCase {
    public static String swapCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String swapped = swapCase(input);
        System.out.println("Original: " + input);
        System.out.println("Swapped: " + swapped);
    }
}
