package Stringmanipulation;

import java.util.*;

public class FindDupicatedInString {

    public static void main(String[] args) {
//        System.out.println(reverseString("Jeshwanth"));
        System.out.println(duplicateinString("Jeshwanth"));
    }

    public static String duplicateinString(String str) {
        char[] name = str.toCharArray();
        HashSet<Character> duplicate = new HashSet<Character>();
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<name.length;i++){
            if(set.contains(name[i])){
                duplicate.add(name[i]);
            }
            set.add(name[i]);
        }
       return duplicate.toString();
    }

    public static void reverseString2(String str) {
        char[] name = str.toCharArray();
       HashMap<Character,Integer> map = new HashMap<>();
       for(char c:name){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }
           else {
               map.put(c,1);
           }
       }
       Set<Character> key = map.keySet();
       for(Character c:key){
           if(map.get(c)>1) {
               System.out.print(c+" ");
           }
       }
    }
}
