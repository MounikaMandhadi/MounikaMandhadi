package Day5;

class Child extends ParentClass {
    public int childVariable;

    Child(int parentVariable, int childVariable) {
        super(parentVariable); // Initialize the parent class's variable
        this.childVariable = childVariable; // Initialize the child class's variable
    }

    // Overloaded constructor that takes only one parameter
    Child(int childVariable) {
        super(0); // Call the parent class's constructor with a default value for parentVariable
        this.childVariable = childVariable; // Initialize the child class's variable
    }
}

public class ChildClass {
    public static void main(String[] args) {
        Child child1 = new Child(10, 20); // Creating an instance of Child with values 10 and 20
        Child child2 = new Child(30,40); // Creating an instance of Child with value 30

        System.out.println("Parent Variable in child1: " + child1.parentVariable); // Accessing parentVariable in child1
        System.out.println("Child Variable in child1: " + child1.childVariable); // Accessing childVariable in child1

        System.out.println("Parent Variable in child2: " + child2.parentVariable); // Accessing parentVariable in child2
        System.out.println("Child Variable in child2: " + child2.childVariable); // Accessing childVariable in child2
    }
}
