package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return new ArrayList<>();
        }

        return numbers.stream()
                .distinct() // Use distinct to remove duplicates
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        List<Integer> distinctNumbers = removeDuplicates(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("List without Duplicates: " + distinctNumbers);
    }
}

