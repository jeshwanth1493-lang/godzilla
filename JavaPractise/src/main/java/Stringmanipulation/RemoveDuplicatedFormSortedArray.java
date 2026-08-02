package Stringmanipulation;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores)
public class RemoveDuplicatedFormSortedArray {
    public static void main (String[] args) {
        int[] nums = {1,1,2,2};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;


    }


}
