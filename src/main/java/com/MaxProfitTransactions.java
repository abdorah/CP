package com;

public class MaxProfitTransactions {

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