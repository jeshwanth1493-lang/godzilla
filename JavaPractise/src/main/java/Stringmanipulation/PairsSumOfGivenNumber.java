package Stringmanipulation;

import java.util.*;

public class PairsSumOfGivenNumber {

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {

            int diff = target-num;

            if(set.contains(diff)) {
                System.out.println("Number pair:"+diff+":"+num);
            }

            set.add(num);
        }
    }

}
