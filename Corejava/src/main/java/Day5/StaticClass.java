package Day5;

public class StaticClass {
	static int x;

	public static int getX() {
		return x;
	}

	public static void main(String[] args) {
		x = 5;
		int value = getX();
		System.out.println("The assigned value of x is " + value);

	}

}
