package list;

import java.util.ArrayList;
import java.util.List;

public class EnhancedLoop {

    public static List<Integer> createList() {
        List<Integer> myList = new ArrayList<Integer>();

        // Adding elements to the list (Custom inputs)
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        return myList;
    }

    public static void main(String[] args) {
        List<Integer> myList = createList();

        // For loop for iterating over the List
        for (int i : myList) {
            // Print all elements of List
            System.out.println(i);
        }
    }
}
