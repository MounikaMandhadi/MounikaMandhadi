package strings;

public class Stringrotation {
	
	public static boolean checkRotation(String s1, String s2 ) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String s3 = s1 + s1;
		if(s3.contains(s2)) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		
		if(checkRotation (s1, s2)) {
			System.out.println("Yes, " + s2 + " is rotation of " + s1);
		}else {
            System.out.println("No " + s2 + " is not a rotation of " + s1);
			
		}

		
	}

}
