package MapRelatedProblems;

import java.util.HashMap;
import java.util.Map;

//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//Example 1:
//
//Input: s = "egg", t = "add"
//
//Output: true
//
//Explanation:
//
//The strings s and t can be made identical by:
//
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.
//Example 2:
//
//Input: s = "f11", t = "b23"
//
//Output: false
//
//Explanation:
//
//The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.
//
//Example 3:
//
//Input: s = "paper", t = "title"
//
//Output: true

public class IsoMorphicString {

    public static void main (String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));

    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapST.containsKey(ch1)) {

                if (mapST.get(ch1) != ch2)
                    return false;

            } else {
                mapST.put(ch1, ch2);
            }

            if (mapTS.containsKey(ch2)) {

                if (mapTS.get(ch2) != ch1)
                    return false;

            } else {
                mapTS.put(ch2, ch1);
            }
        }

        return true;
    }
}
