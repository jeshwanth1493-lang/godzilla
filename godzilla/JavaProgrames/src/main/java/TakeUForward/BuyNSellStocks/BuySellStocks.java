package TakeUForward.BuyNSellStocks;

public class BuySellStocks {

    public static void main(String[] args) {
        int[] prices = {3, 2, 1, 4, 6, 2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < least) {
                least = prices[i];
            }
            if(prices[i]>maxProfit ) {
                maxProfit = Math.max(maxProfit,prices[i]-least);
            }
        }
        return Math.max(0,maxProfit);
    }
}
