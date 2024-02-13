package list;

public class SumArray {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = calculateSum(array);

        System.out.println("Sum of all items in the array: " + sum);
    }
}
