package DynamicPrograming;

public class KnapSack {

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};
        int[] values = {10, 40, 50, 70};

        int capacity = 8;

        int result = knapsack(weights, values, capacity);

        System.out.println("Maximum Profit = " + result);
    }

    private static int knapsack(int[] weights, int[] values, int capacity) {

        int n = weights.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {

            for (int w = 1; w <= capacity; w++) {

                // current item can fit
                if (weights[i - 1] <= w) {

                    int include =
                            values[i - 1]
                                    + dp[i - 1][w - weights[i - 1]];

                    int exclude =
                            dp[i - 1][w];

                    dp[i][w] = Math.max(include, exclude);

                } else {

                    // cannot include item
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }


}
