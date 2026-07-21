package Stringmanipulation;

import java.util.Arrays;

//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
//
//
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
public class CanJump {
    public static boolean canJump(int[] nums) {

        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            // Cannot even reach this position
            if (i > farthest) {
                return false;
            }

            // Update the farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);

            // Last index is reachable
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(canJump(nums1));

    }
}
