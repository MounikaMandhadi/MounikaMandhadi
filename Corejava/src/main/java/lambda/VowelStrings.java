package lambda;

import java.util.HashSet;
import java.util.Set;

public class VowelStrings {
    public static void printVowelStrings(String[] strings) {
        if (strings == null) {
            return;
        }

        for (String str : strings) {
            Set<Character> foundVowels = new HashSet<>();
            StringBuilder vowelString = new StringBuilder();

            for (char c : str.toCharArray()) {
                if ("aeiou".indexOf(c) != -1 && !foundVowels.contains(c)) {
                    foundVowels.add(c);
                    vowelString.append(c);
                }
            }

            int vowelCount = foundVowels.size();
            if (vowelCount > 0) {
                System.out.println("String: " + str);
                System.out.println("Vowels: " + vowelString.toString() + " (" + vowelCount + " vowels)");
            }
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"hello", "world", "java", "programming"};
        printVowelStrings(stringArray);


    }
}
