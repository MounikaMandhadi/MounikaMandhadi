package arrays;
import java.util.Arrays;

public class Function {

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 0, 3, 4, 5, 0, 7, 8, 0, 9, 10};

        int temp;
        int count = 0;

        // Iterating through the array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                // Swapping non-zero element to the beginning
                temp = arr1[count];
                arr1[count] = arr1[i];
                arr1[i] = temp;
                count++;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}

