package lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {
    public static List<String> filterStringsStartingWithA(List<String> inputList) {
        // Define a lambda predicate to check if a string starts with "A"
        Predicate<String> startsWithA = str -> str.startsWith("A") || str.startsWith("a");

        // Use stream and filter to apply the predicate and collect the filtered strings
        List<String> filteredList = inputList.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());

        return filteredList;
    }
}
