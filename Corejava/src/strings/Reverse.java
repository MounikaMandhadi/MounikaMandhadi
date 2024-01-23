package strings;

public class Reverse {
    public static void main(String[] args) {
        String inputSentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseEachWord(inputSentence);
        System.out.println(reversedSentence);
    }

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse(); 
            reversedSentence.append(reversedWord).append(" "); // 
        }

        return reversedSentence.toString().trim(); 
    }
}
