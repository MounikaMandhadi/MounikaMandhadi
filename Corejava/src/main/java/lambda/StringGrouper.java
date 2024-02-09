package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class StringGrouper {
    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        if (strings == null) {
            return Collections.emptyMap(); // Return an empty map if the input is null
        }

        Map<Integer, List<String>> groupedMap = new HashMap<>();

        for (String str : strings) {
            int length = str.length();
            groupedMap.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
        }

        return groupedMap;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        Map<Integer, List<String>> groupedMap = groupStringsByLength(stringList);

        groupedMap.forEach((length, group) -> {
            System.out.println("Strings with length " + length + ":");
            group.forEach(System.out::println);
        });
    }
}
