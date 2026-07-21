package Stringmanipulation;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]
//Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
public class RemoveDuplicatedFormSortedArray2 {

    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int j = 2;

        for (int i = 2; i < nums.length; i++) {

            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;

    }

    public static void main (String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));

    }
}
