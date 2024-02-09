package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static Map<String, Integer> countUniqueWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        if (input != null && !input.isEmpty()) {
            String[] words = input.split("\\s+");

            for (String word : words) {
                word = word.toLowerCase();
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
      System.out.println(wordCountMap);
        return wordCountMap;
    }
}
