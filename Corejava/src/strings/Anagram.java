package strings;

import java.util.Arrays;
import java.util.Scanner;

 public class Anagram {
  public static void main(String[] args) {

    
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter first String: ");
    String str1 = sc.nextLine();
    str1 = str1.toLowerCase();
   
    System.out.print("Enter second String: ");
    String str2 = sc.nextLine();
    str2 = str2.toLowerCase();

   
    if(str1.length() == str2.length()) {

      
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    

    sc.close();
  }
}
























// Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string. In other words, we can say that two strings are anagrams if they contain the same characters but in a different order. Note that a letter has to be used only once