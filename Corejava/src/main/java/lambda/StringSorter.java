package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {
    public static String[] sortStrings(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0]; // Return an empty array if the input is null or empty
        }

        Arrays.sort(strings, Comparator.comparingInt(String::length) // Sort by length in ascending order
                .thenComparing((a, b) -> Character.compare(b.charAt(b.length() - 1), a.charAt(a.length() - 1)))); // Sort by last character in descending order when lengths are equal

        return strings;
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        String[] sortedArray = sortStrings(stringArray);

        System.out.println("Sorted Strings:");
        for (String str : sortedArray) {
            System.out.println(str);
        }
    }
}

