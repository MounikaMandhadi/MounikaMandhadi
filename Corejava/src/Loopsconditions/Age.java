package Loopsconditions;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");

	int age = sc.nextInt() ;
	
	if(age >= 13 && age <= 19) {
		System.out.println("The person is teen");
	}else if(age <13) {
		System.out.println("The person is kid");
	}else {
		System.out.println("The person is adult");
		
		
	}
	sc.close();
    
	}

}
