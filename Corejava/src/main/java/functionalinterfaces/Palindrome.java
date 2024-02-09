package functionalinterfaces;

import java.util.*;
    class Palindrome {
        public static boolean isPalindrome(String str) {
            String original = str;
            String reverse = "";
            int length = original.length();
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);
            return original.equals(reverse);
        }
    }
