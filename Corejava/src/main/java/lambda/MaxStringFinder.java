package lambda;

import java.util.List;
import java.util.Optional;

public class MaxStringFinder {
    public static String findMaxString(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return null; // Return null if the list is null or empty
        }

        Optional<String> maxString = stringList.stream()
                .max(String::compareToIgnoreCase);

        return maxString.orElse(null); // Return the maximum string or null if not found
    }

    public static void main(String[] args) {
        // Test cases
        List<String> stringList1 = List.of("apple", "banana", "cherry", "date", "fig");
        List<String> stringList2 = List.of();
        List<String> stringList3 = null;

        String maxString1 = findMaxString(stringList1);
        String maxString2 = findMaxString(stringList2);
        String maxString3 = findMaxString(stringList3);

        System.out.println("Max String 1: " + maxString1);
        System.out.println("Max String 2: " + maxString2);
        System.out.println("Max String 3: " + maxString3);
    }
}
