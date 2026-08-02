package TakeUForward.MergeSortedArrays;

import java.util.*;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
System.out.println(Arrays.toString(mergeArrays(nums1, nums2)));

    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {

        int m = nums2.length;
        int n = nums1.length;

        int i=(n-m)-1;
        int j=m-1;
        int k=n-1;

        while(i>=0 && j>=0) {
            if(nums2[j] > nums1[i]) {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
            else {
                nums1[k]= nums1[i];
                k--;
                i--;
            }
        }
        return nums1;
    }
}
