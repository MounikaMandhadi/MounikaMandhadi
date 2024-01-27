package list;

import java.util.ArrayList;

public class ConvertingArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");

        // Convert ArrayList to an array of Strings
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}