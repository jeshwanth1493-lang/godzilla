package MapRelatedProblems;

import java.util.HashMap;
import java.util.Map;

//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//
//
//
//Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
public class RansomNote {

    public static void main (String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));

    }


    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer> mag = new HashMap<>();

        for(Character c : magazine.toCharArray()) {
            if(mag.containsKey(c)) {
                mag.put(c,mag.get(c)+1);
            }
            else {
                mag.put(c,1);            }
        }

        for(Character s:ransomNote.toCharArray()) {
            if(mag.containsKey(s) && mag.get(s)!=0) {
                mag.put(s,mag.get(s)-1);
            }else {
                return false;
            }
        }
        return true;
    }

}
