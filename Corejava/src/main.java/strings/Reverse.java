package strings;

public class Reverse {
    public static void main(String[] args) {
        String[] inputWords = {"Hello", "World"};
        String[] reversedWords = reverseWords(inputWords);

        // Print the reversed words
        for (String word : reversedWords) {
            System.out.println(word);
        }
    }

    public static String[] reverseWords(String[] words) {
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedWords[i] = reversedWord;
        }

        return reversedWords;
    }
}
