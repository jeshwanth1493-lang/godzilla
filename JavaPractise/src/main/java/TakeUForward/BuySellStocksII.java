package TakeUForward;
//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.
//
//Find and return the maximum profit you can achieve.
//
//
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 7
//Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//Total profit is 4 + 3 = 7.

//check if the selling price is greater than the buying prices =>? Sum of all the positive profits
public class BuySellStocksII {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int profit =0;
        int index =0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>prices[index]) {
                profit+=prices[i]-prices[index];
            }
            index++;
        }

        return profit;
    }
}
