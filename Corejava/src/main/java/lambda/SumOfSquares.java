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

    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, -4, 5, -6, 7, 8);

        int sumOfSquares = calculateSumOfSquares(numberList);

        System.out.println("Sum of squares of positive integers: " + sumOfSquares);
    }
}
