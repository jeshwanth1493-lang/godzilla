package Stringmanipulation;

public class TotalSumFromArray {

    public static void main(String[] args) {

        int[] nums = {1,19,2,3,4,5};
        int target = 15;
        int i=0;
        int j=nums.length-1;
        int count =0;

        while(target>0) {

            if(nums[j]>nums[i] || nums[j]==nums[i]) {

                if(!(nums[j] >target)) {
                    target -= nums[j];
                    count++;
                }
                j--;
            } else {
                if(!(nums[i] >target)) {
                    target -= nums[j];
                    count++;
                }
                i++;
            }
        }

        System.out.println(count);
    }
}
