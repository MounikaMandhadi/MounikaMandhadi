package Loopsconditions;

public class Reverse {

	public static void main(String[] args) {
		int num = 12345;
		int r = 0;
		
		while (num > 0) {
			int digit = num%10;
		    r = r * 10 + digit;
		    
		    num = num / 10 ;   
		}

		System.out.println(r);
		

	}

}

