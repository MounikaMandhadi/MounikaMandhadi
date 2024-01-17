package Loopsconditions;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        int N = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 0; i < N; i++) { // Change the loop condition to i < N
            System.out.print(first + " "); // Use print instead of println

            int num = first + second;
            first = second;
            second = num;
        }

        sc.close(); // Close the scanner when done.
    }
}
