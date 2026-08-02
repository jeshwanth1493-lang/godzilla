package Stringmanipulation;

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacter {

    public static void main(String[] args) {

        String str = "javaconceptoftheday";
        char[] chars = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int start =0;
        int maxLenth=0;
        String longestWord = "";

        //check till the value repeats and then remove the charaacters before it till only 1 character remains
        for(int i=0; i<str.length(); i++){
            while(set.contains(chars[i]))   {
                set.remove(chars[start]);
                start++;
            }
            set.add(chars[i]);

            //check for maxLenght
            if((i-start)+1> maxLenth){
                maxLenth = (i-start)+1;
                longestWord=str.substring(start,i+1);
            }

        }

        System.out.println(longestWord);
    }
}
