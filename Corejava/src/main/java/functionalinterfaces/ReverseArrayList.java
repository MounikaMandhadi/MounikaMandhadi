package functionalinterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Fig");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Reverse the ArrayList using Collections.reverse method
        Collections.reverse(list);

        // Display the reversed ArrayList
        System.out.println("Reversed ArrayList: " + list);
    }
}
