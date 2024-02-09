package functionalinterfaces;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharactersTest {
    public static void main(String[] args) {
        // Test Case 1: No Duplicate Characters
        String input1 = "NoDuplicates";
        DuplicateCharacters.DuplicateCharacters(input1);

        // Test Case 2: Single Duplicate Character
        String input2 = "Testing";
        DuplicateCharacters.DuplicateCharacters(input2);

        // Test Case 3: Multiple Duplicate Characters
        String input3 = "Mississippi";
        DuplicateCharacters.DuplicateCharacters(input3);

        // Test Case 4: Duplicate Characters with Spaces
        String input4 = "Hello World";
        DuplicateCharacters.DuplicateCharacters(input4);

        // Test Case 5: Empty String
        String input5 = "";
        DuplicateCharacters.DuplicateCharacters(input5);
    }
}