package sets;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "java programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> uniqueChars = new HashSet<>(); // HashSet to store unique characters
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                result.append(currentChar); // Adding characters to the result if they are not duplicates
            }
        }

        return result.toString();
    }
}
