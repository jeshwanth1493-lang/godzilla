package Stringmanipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SummaryRanges {

    public static void main(String[] args) {
        int [] nums = {-2147483648,-2147483647,2147483647};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {

         List<String> list = new ArrayList<>();
         int i=0;
         while(i<nums.length) {
            int a = nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1) {
                i++;
            }
            if(a==nums[i]) {
                list.add(String.valueOf(a));
            }
            else {
                list.add(a+"->"+nums[i]);
            }
            i++;
         }
        return list;

    }

}
