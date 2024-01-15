package Day5;

class Child extends ParentClass {
    public int childVariable;

    Child(int parentVariable, int childVariable) {
        super(parentVariable); 
        this.childVariable = childVariable; 
    }

    
    Child(int childVariable) {
        super(0); 
        this.childVariable = childVariable; 
    }
}

public class ChildClass {
    public static void main(String[] args) {
        Child child1 = new Child(10, 20); 
        Child child2 = new Child(30,40); 

        System.out.println("Parent Variable in child1: " + child1.parentVariable); 
        System.out.println("Child Variable in child1: " + child1.childVariable); 

        System.out.println("Parent Variable in child2: " + child2.parentVariable); 
        System.out.println("Child Variable in child2: " + child2.childVariable); 
    }
}
