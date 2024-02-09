package lambda;

public class AverageOfSquares {
    public static double findAverageOfSquaresOfOddNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0; // Return 0 if the array is empty or null
        }

        int sumOfSquares = 0;
        int countOfOddNumbers = 0;

        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sumOfSquares += num * num; // Square the odd number and add to the sum
                countOfOddNumbers++;
            }
        }

        if (countOfOddNumbers == 0) {
            return 0.0; // Return 0 if there are no odd numbers in the array
        }

        return (double) sumOfSquares / countOfOddNumbers; // Calculate and return the average
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double average = findAverageOfSquaresOfOddNumbers(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }
}
