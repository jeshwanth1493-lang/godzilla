package DynamicPrograming;

//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//
//Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
//
//You may assume that you have an infinite number of each kind of coin.
//
//
//
//Example 1:
//
//Input: coins = [1,2,5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1
//https://www.youtube.com/watch?v=NNcN5X1wsaw
public class CoinChange {

    public static void main(String[] args)
    {
        int[] n ={1,2,5};
        int amount = 11;
        System.out.println(coinChange(n,amount));

    }

    public static int coinChange(int[] coins, int amount) {
        // Check edge case
        if (amount < 1) return 0;

        // Create DP array
        int[] minCoinsDP = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {

            minCoinsDP[i] = Integer.MAX_VALUE;

            // Try each coin
            for (int coin : coins) {
                if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
                    //here 1 is the coin itself + the coins required to make reminder
                    //in order to make 4re using 1re coin we ll need to check how many coins are needed to make reminder = 3
                    // so minCoinsDP[3] = 2 and then + 1 coin of 1re = 3 coins if starting with 1re
                    //Similary in order to make 4re using 2re coin -> 2re coin + reminder 2 =  minCoinsDP[2]= 1 = 2re *1coin + 1* 2re coin=2 coins
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
            }
        }

        return minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
    }
}
