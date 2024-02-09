package lambda;

import java.util.Arrays;

public class StringCapitalization {
    public static String[] capitalizeAndSort(String[] strings) {
        if (strings == null) {
            return null;
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && !strings[i].isEmpty()) {
                // Capitalize the first letter of each string
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
            }
        }

        // Sort the array of strings alphabetically
        Arrays.sort(strings);

        return strings;
    }

    public static void main(String[] args) {
        // Input array of lowercase fruit names
        String[] inputArray = {"apple", "banana", "cherry", "date", "fig"};

        // Call the capitalizeAndSort method to process the input array
        String[] resultArray = capitalizeAndSort(inputArray);

        // Print the result
        System.out.println("Capitalized and Sorted Strings:");
        for (String str : resultArray) {
            System.out.println(str);
        }
    }
}

