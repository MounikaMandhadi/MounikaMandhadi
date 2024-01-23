package strings;

import java.util.Scanner;

public class Vowels {

	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int count = 0;
		 System.out.println("Enter a sentence : ");
		 String Sentence = sc.nextLine();
		 
		 for(int i = 0; i < Sentence.length();i++) {
			 char ch = Sentence.charAt(i);
			 if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
				 count ++;
			 }
			 
		 }
		 System.out.println("Number of vowels in this sentence is : " +count);
		 
		 
		 
}
}
