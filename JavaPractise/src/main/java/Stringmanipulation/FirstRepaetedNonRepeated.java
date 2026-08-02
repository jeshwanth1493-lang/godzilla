package Stringmanipulation;

import javax.swing.plaf.synth.*;
import java.util.*;

    public class FirstRepaetedNonRepeated {

    public static void main(String[] args) {

        String str = "JavaConceptOfTheDay";
        abc(str);
//        char[] c = str.toCharArray();
//        boolean found = false;
//        List<Character> set = new ArrayList<>();
//
//        for(int i=0; i< str.length(); i++){
//
//            set.add(str.charAt(i));
//
//            for(int j=i+1; j< str.length();j++) {
//
//
//
//                if(c[i]==c[j]) {
//                    System.out.print(c[i]+":First Reapeat");
//                    found = true;
//                    break;
//                }
//            }
//
//            if(found){
//                break;
//            }
//        }
//
//        System.out.println(":  First non repeat"+set.get(0));
    }

    public static void abc(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++) {

            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        boolean firstRepeatFound = false;
        boolean firstNonRepeatFound = false;

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue()==(1) && !firstNonRepeatFound) {
                System.out.println("First non repeated:"+entry.getKey());
                firstNonRepeatFound=true;
            }
            if(entry.getValue()>1 && !firstRepeatFound) {
                System.out.println("First repeated:"+entry.getKey());
                firstRepeatFound=true;
            }
        }

    }
}
