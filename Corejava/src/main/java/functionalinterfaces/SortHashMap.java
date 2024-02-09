package functionalinterfaces;

import java.util.*;

public class SortHashMap {
    public static HashMap<String, Integer> sortHashMap(HashMap<String, Integer> unsortedMap) {
        // Convert HashMap entries to a List of Map.Entry
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());

        // Sort the List based on values (ascending order)
        Collections.sort(list, (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        // Create a new LinkedHashMap to maintain the sorted order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        // Create an unsorted HashMap
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Cherry", 8);
        unsortedMap.put("Date", 3);
        unsortedMap.put("Fig", 1);

        // Sort the HashMap
        HashMap<String, Integer> sortedMap = sortHashMap(unsortedMap);

        // Display the sorted HashMap
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
