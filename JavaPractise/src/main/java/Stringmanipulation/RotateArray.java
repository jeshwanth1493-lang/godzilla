package Stringmanipulation;

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int[] num1 = {1,2,3,4,5,6,7};
        int r = 3;
//        System.out.println(Arrays.toString(reverseLimit(num,0,num.length-1)));
        leftRotate(num,r);
        rightRotate(num1,r);
    }

    public static int[] leftRotate(int[] nums, int k) {

        reverseLimit(nums,0,k-1);
        reverseLimit(nums,k,nums.length-1);
        reverseLimit(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int[] rightRotate(int[] nums, int k) {
//int n = nums.length;
//        k = k % n;
//
//        reverseLimit(nums, n - k, n - 1);
//
//        reverseLimit(nums, 0, n - k - 1);
//
//        reverseLimit(nums, 0, n - 1);
        int last = nums.length-1;

        reverseLimit(nums,nums.length-k,last);
        reverseLimit(nums,0,last-k);
        reverseLimit(nums, 0, nums.length-1);
//        System.out.println(Arrays.toString(rev));
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int[] reverse(int[] nums) {
        int[] reverse = new int[nums.length];
        int j=0;
        for (int i = nums.length-1; i >=0; i--) {
            reverse[j] = nums[i];
            j++;
        }
        return reverse;
    }

    public static int[] reverseLimit(int[] nums, int start, int end) {

        while (start < end) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

        return nums;
    }



}
