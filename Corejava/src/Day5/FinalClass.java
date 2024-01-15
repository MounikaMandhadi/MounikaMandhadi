package Day5;

public final class FinalClass {
    
    final int finalVariable;

   
    public FinalClass(int value) {
        this.finalVariable = value;
    }

    
    final void finalMethod() {
        System.out.println("This is a final method in FinalClass");
    }

    public static void main(String[] args) {
        
        FinalClass finalObj = new FinalClass(10);

        
        int value = finalObj.finalVariable;
        System.out.println("Value of finalVariable: " + value);
    }
}


