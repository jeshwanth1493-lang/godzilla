package TakeUForward.LongestSequenceInArray;

import java.util.*;

public class LongestSequenceInArray {

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 11, 13, 12};
        System.out.println(findLongestSequenceNo(a));
    }

    private static int findLongestSequenceNo(int[] a) {

        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for (int n : a) {
            set.add(n);
        }
        for (int n : set) {

            if (!set.contains(n - 1)) {
                int count = 1;
                int element = n;


                while (set.contains(element + 1)) {
                    count++;
                    element++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
