package arrays;

public class Leftrotate {

	public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5,6,7};
		        int x = 2;

		        System.out.println("Original Array:");
		        printArray(arr);

		        leftRotate(arr, x);

		        System.out.println("Array after left rotation by " + x + " position(s):");
		        printArray(arr);
		    }

		    static void leftRotate(int[] arr, int positions) {
		        int n = arr.length;
		        int[] rotatedArray = new int[n];

		        for (int i = 0; i < n; i++) {
		            int newPosition = (i + n - positions) % n;
		            rotatedArray[newPosition] = arr[i];
		        }

		        // Copy the rotated array back to the original array
		        System.arraycopy(rotatedArray, 0, arr, 0, n);
		    }

		    static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		}

	


