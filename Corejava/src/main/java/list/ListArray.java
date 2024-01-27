package list;


import java.util.List;
import java.util.ArrayList;

public class ListArray {
    public static void main(String args[]) {
        // Creating an ArrayList
        List<Integer> myList = new ArrayList<Integer>();

        // Adding elements to the list (Custom inputs)
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        // For loop for iterating over the List
        for (int i = 0; i < myList.size(); i++) {
            // Print all elements of List
            System.out.println(myList.get(i));
        }
    }
}
