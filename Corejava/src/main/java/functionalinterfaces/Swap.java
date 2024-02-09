package functionalinterfaces;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before swapping numbers: " + x + " " + y);
        swapNumbers(x, y);
        System.out.println("After swapping: " + x + " " + y);
    }

    public static void swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}

