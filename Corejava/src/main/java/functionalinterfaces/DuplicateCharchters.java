package functionalinterfaces;

class DuplicateCharacters {
    public static void DuplicateCharacters(String input) {
        int count;
        char string[] = input.toCharArray();

        System.out.println("Duplicate characters in a given string: ");

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}
