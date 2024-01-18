package arrays;

public class Sort {

    public static void main(String[] args) {

        int[] array = new int[] { 10, 12, 24, 35, 46, 57, 68, 79,100};

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Largest Number is " + largest);
        System.out.println("Smallest Number is " + smallest);
    }
}
