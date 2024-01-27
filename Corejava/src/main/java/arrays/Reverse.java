package arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] array = { 1, 4, 9, 16, 25 };
		System.out.println("Array before reverse : " + Arrays.toString(array));

		arrayReverse(array);// method invoking
		System.out.println("Array after reverse : " + Arrays.toString(array));
	}

	// method declaration
	static void arrayReverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}

	}
}

