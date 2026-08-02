package TakeUForward;
//To reach the nth stair, I can either come from the (n-1)th stair by taking one step or from
// the (n-2)th stair by taking two steps. Therefore, the recurrence is dp[i] = dp[i-1] + dp[i-2],
// which is the Fibonacci sequence. I initialize the base cases dp[1] = 1 and dp[2] = 2,
// then iteratively compute the remaining values. To optimize space, I only keep track of the previous
// two results, achieving O(n) time and O(1) space.

//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
//
//Example 1:
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
public class ClimbStairs {

    public static void main(String[] args) {
        int n = 3;

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 2)
            return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {

            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}
