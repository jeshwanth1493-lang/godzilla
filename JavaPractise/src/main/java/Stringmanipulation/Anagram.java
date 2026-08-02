package Stringmanipulation;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : s1.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        for(Character c : s2.toCharArray()) {
            if(!map.containsKey(c)) {
               return false;
            }
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) {
                map.remove(c);
            }
        }

        if(map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram3(
            String s1,
            String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            count[s1.charAt(i) - 'a']++;

            count[s2.charAt(i) - 'a']--;
        }

        for (int n : count) {

            if (n != 0) {
                return false;
            }
        }

        return true;
    }
}
