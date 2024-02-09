package lambda;

public class MathOperationExample {
    public static void main(String[] args) {
        // Implement the addition operation using a lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Test the addition operation
        int result = addition.operate(10, 20);
        System.out.println("Result of addition: " + result);
    }
}
