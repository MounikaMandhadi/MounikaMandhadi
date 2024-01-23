
package strings;

import java.util.Arrays;

public class Anagram {

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}


// Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string. In other words, we can say that two strings are anagrams if they contain the same characters but in a different order. Note that a letter has to be used only once