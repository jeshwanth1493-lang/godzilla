package TakeUForward.LongestSubArrayWithZeroSum;

import java.util.*;

public class LongestSubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr= {9, -3, 3, -1, 6, -5};
        System.out.println(findLongestSUnArrayLegth(arr));
    }

    private static int findLongestSUnArrayLegth(int[] arr) {

        int sum =0;
        int max =0;
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max=i+1;
            }
            else {
                if (mpp.containsKey(sum)) {
                    // maximize length
                    max = Math.max(max, i - mpp.get(sum));
                }
                // first time seeing this sum
                else {
                    // record index
                    mpp.put(sum, i);
                }
            }
        }
        return max;
    }
}
