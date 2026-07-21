package TakeUForward;

// TAKE prev2 is 0 as it is 2 houses previous
//take prev 1 as the max(0,1) : lets keep it as 1
// current sum = Max of(either prev2+current=(i=2), prev1) => due to adjucent houses cant be robed
//Next is to assign prev2=prev1, prev1=current

public class HouseRobber {

    public static void main(String[] args)
    {
        int[] n ={1,3,1,3,100};
        System.out.println(rob(n));

    }

    public static int rob(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int current = Math.max(prev1, nums[i] + prev2);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

}
