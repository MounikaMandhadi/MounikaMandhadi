package lambda;

import java.util.List;

public class SumOfSquares {
    public static int calculateSumOfSquares(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0; // Return 0 if the list is null or empty
        }

        int sum = numbers.stream()
                .filter(num -> num > 0) // Filter positive numbers
                .mapToInt(num -> num * num) // Square each positive number
                .sum(); // Calculate the sum of squared positive numbers

        return sum;
    }

}
