package Stringmanipulation;

import java.util.*;

public class CommonElementsIn2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<Integer>();
        for (int j : arr1) {
            set.add(j);
        }

        for (int j : arr2) {
            if(set.contains(j)) {
                System.out.println(j);
            }
        }

    }
}
