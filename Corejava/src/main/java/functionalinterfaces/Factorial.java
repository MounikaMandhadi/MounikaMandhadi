package functionalinterfaces;

public class Factorial {
    public static void main(String args[]) {
        int number = 5; // It is the number to calculate factorial
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int number) {
        if (number < 0) {
            return -1; // Factorial of negative numbers is not defined
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
