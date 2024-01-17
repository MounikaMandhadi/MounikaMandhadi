package Loopsconditions;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 0; i < num; i++) { 
            System.out.print(first + " "); 

            int num1 = first + second;
            first = second;
            second = num1;
        }

        sc.close(); 
    }
}

