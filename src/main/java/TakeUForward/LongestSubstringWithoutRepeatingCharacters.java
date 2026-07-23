package TakeUForward;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main (String[] args) {
        String word = "pwwkew";
        System.out.println(longestSubString(word));

    }

    private static int longestSubString(String word) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < word.length(); right++) {

            while (set.contains(word.charAt(right))) {
                set.remove(word.charAt(left));
                left++;
            }

            set.add(word.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
