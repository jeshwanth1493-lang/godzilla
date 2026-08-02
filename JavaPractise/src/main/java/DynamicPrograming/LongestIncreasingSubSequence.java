package DynamicPrograming;

//Given an integer array nums, return the length of the longest strictly increasing subsequence.
//
//
//
//Example 1:
//
//Input: nums = [10,9,2,5,3,7,101,18]
//Output: 4
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.


//Answer:
// First initailze an array of same size to 1 dp= [1,1,1,1,1,1]
//i=1 and j=0
//check if previous element is lesser than current i element = nums[j]<nums[i]
//if true then increase the value of current dp value by 1 than the previous dp value by dp[i]= Math.max(dp[i],1+dp[j])
//once the j iteration is done:
//populate the maxCount = max(maxCount,dp[i])
//end return ,maxCount
public class LongestIncreasingSubSequence {

    public static void main(String[] args)
    {
        int[] n ={0,1,0,3,2,3};
        System.out.println(lengthOfLIS(n));

    }


    public static int lengthOfLIS(int[] nums) {

        int[] dp=new int[nums.length];
        for(int i=0;i< nums.length;i++) {
            dp[i]=1;
        }

        int maxCount = 1;

        for(int i=1;i<nums.length;i++) {
            for(int j=0;j<i;j++) {
                if(nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }

            maxCount = Math.max(maxCount, dp[i]);
        }
        return maxCount;
    }

    //int[] dp = new int[nums.length];
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        dp[i] = 1;
    //    }
    //
    //    int maxCount = 1;
    //
    //    for (int i = 1; i < nums.length; i++) {
    //
    //        for (int j = 0; j < i; j++) {
    //
    //            if (nums[j] < nums[i]) {
    //
    //                dp[i] = Math.max(dp[i], dp[j] + 1);
    //            }
    //        }
    //
    //        maxCount = Math.max(maxCount, dp[i]);
    //    }
    //
    //    return maxCount;
}


