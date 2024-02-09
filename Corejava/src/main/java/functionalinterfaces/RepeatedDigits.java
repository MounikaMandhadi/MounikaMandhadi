package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class RepeatedDigits {
    public static List<Integer> findRepeatedDigits(int number) {
        List<Integer> repeatedDigits = new ArrayList<>();
        int[] digitCount = new int[10]; // We have 10 possible digits (0 to 9).

        // Go through each digit in the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            digitCount[digit]++; // Increase the count for that digit
            number /= 10; // Move to the next digit
        }

        // Check which digits appeared more than once and add them to the list
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 1) {
                repeatedDigits.add(i);
            }
        }

        return repeatedDigits;
    }

    public static void main(String[] args) {
        int inputNumber = 12233445;
        List<Integer> result = findRepeatedDigits(inputNumber);

        System.out.println("Repeated digits: " + result);
    }
}



