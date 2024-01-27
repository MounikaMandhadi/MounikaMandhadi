package Day5;

public final class FinalClass {
    // Declare a final variable
    final int finalVariable;

    // Constructor to initialize the final variable
    public FinalClass(int value) {
        this.finalVariable = value;
    }

    // Declare a final method that can only be accessed by classes in the same package
    final void finalMethod() {
        System.out.println("This is a final method in FinalClass");
    }

    public static void main(String[] args) {
        // Create an instance of FinalClass and initialize the finalVariable
        FinalClass finalObj = new FinalClass(10);

        // Access the finalVariable
        int value = finalObj.finalVariable;
        System.out.println("Value of finalVariable: " + value);
    }
}


