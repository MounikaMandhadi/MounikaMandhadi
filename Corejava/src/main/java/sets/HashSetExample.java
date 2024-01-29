package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("One");
        stringHashSet.add("Two");
        stringHashSet.add("Three");
        stringHashSet.add("Four");
        stringHashSet.add("Five");
        stringHashSet.add("Six");
        stringHashSet.add("Seven");
        stringHashSet.add("Eight");
        stringHashSet.add("Nine");
        stringHashSet.add("Ten");

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }

        System.out.println("\nIterating using for loop:");
        for (String word : stringHashSet) {
            System.out.println(word);
        }

        System.out.println("\nIterating using enhanced for loop:");
        for (String word : stringHashSet) {
            System.out.println(word);
        }
    }
}

