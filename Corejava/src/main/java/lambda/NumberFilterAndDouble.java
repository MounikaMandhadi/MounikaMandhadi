package lambda;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilterAndDouble {
    public static List<Integer> filterAndDouble(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }

        List<Integer> filteredAndDoubledNumbers = numbers.stream()
                .filter(num -> num % 2 != 0) // Filter out even numbers
                .map(num -> num * 2) // Double each remaining number
                .collect(Collectors.toList());

        return filteredAndDoubledNumbers;
    }
}
