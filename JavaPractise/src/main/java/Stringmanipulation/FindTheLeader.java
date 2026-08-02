package Stringmanipulation;

import java.util.*;

public class FindTheLeader {

    public static void main(String[] args) {

        int[] a =  {14, 9, 11, 7, 8, 5, 3};
        leaders(a);
//        ArrayList<Integer> leaders = new ArrayList<>();
//        int j=0;
//        for(int i=0;i <a.length;i++) {
//
//            if(i!= a.length-1 && a[i]>a[i+1]) {
//                leaders.add(a[i]);
//                j++;
//            }
//        }
//        leaders.add(a[a.length-1]);
//
//        System.out.println(leaders);
    }

    public static void leaders(int[] a) {

        List<Integer> leaders = new ArrayList<>();

        int maxRight = a[a.length - 1];
        leaders.add(maxRight);

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > maxRight) {
                leaders.add(a[i]);
                maxRight = a[i];
            }
        }

        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}
