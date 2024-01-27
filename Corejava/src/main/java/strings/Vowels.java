package strings;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        System.out.println("Number of vowels in this sentence is: " + count);
        sc.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
