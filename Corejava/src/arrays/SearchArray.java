package arrays;

import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int key = 40;
		int result = Arrays.binarySearch(arr, key);
		if(result > 0) {
			System.out.println("Element found at the index : "+result);
		}else {
			System.out.println("Element not found");
		}
		
		
		
		

	}

}
