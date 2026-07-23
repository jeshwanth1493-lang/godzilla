package Stringmanipulation;

//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//A subsequence of a string is a new string that is formed from the original string by deleting
// some (can be none) of the characters without disturbing the relative positions of the remaining characters.
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "ace";
        String t = "abcde";
        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {

        int j =0;

        if(s.length()==0) {
            return true;
        }

        for(int i=0;i<t.length();i++) {
            if(t.charAt(i)==(s.charAt(j))) {
                j++;
            }
            if(j==s.length()) {
                return true;
            }
        }
        return false;

    }
}
