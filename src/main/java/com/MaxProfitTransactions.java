package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class MaxProfitTransactions {

    /**
     * @param prices
     * @return max profit possiblr from two consequentives transactions
     */
    public static int maxProfit(int[] prices) {

        int firstBuyingAction = -prices[0];
        int SecondBuyingAction = -prices[0];
        int profit = 0;
        int totalProfit = 0;

        for (int price : prices) {
            firstBuyingAction = Math.max(firstBuyingAction, -price);
            profit = Math.max(profit, price + firstBuyingAction);
            SecondBuyingAction = Math.max(SecondBuyingAction, profit - price);
            totalProfit = Math.max(totalProfit, price + SecondBuyingAction);
        }
        return totalProfit;
    }
}