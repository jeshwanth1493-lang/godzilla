package Stringmanipulation;

import java.util.HashSet;
import java.util.Set;

public class DistrictPairsOfSum {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1, 5, 2, 3, 4};
        int target = 6;

        Set<Integer> seen = new HashSet<>();
        Set<String> printed = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            if (seen.contains(complement)) {

                int first = Math.min(num, complement);
                int second = Math.max(num, complement);

                String pair = first + "," + second;

                if (!printed.contains(pair)) {
                    System.out.println("(" + first + ", " + second + ")");
                    printed.add(pair);
                }
            }

            seen.add(num);
        }
    }
}
