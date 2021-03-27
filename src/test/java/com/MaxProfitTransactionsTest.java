package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class MaxProfitTransactionsTest {

    @Test
    public void shouldAnswerWithTrue()
    {  
        int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
        System.out.println(maxProfitOfOneTransaction(List.of(3, 3, 5, 0, 0, 3, 1, 4)));
        System.out.println(maxProfitLatestInterval(List.of(3, 3, 5, 0, 0, 3, 1, 4)));
        System.out.println(maxProfit(prices));

        int[] prices1 = { 1, 2, 3, 4, 5 };
        System.out.println(maxProfitOfOneTransaction(List.of(1, 2, 3, 4, 5)));
        System.out.println(maxProfitLatestInterval(List.of(1, 2, 3, 4, 5)));
        System.out.println(maxProfit(prices1));

        int[] prices2 = { 1 };
        System.out.println(maxProfitOfOneTransaction(List.of(1)));
        System.out.println(maxProfitLatestInterval(List.of(1)));
        System.out.println(maxProfit(prices2));

        int[] prices3 = { 2, 1, 2, 0, 1 };
        System.out.println(maxProfitOfOneTransaction(List.of(2, 1, 2, 0, 1)));
        System.out.println(maxProfitLatestInterval(List.of(2, 1, 2, 0, 1)));
        System.out.println(maxProfit(prices3));

        int[] prices4 = { 1, 4, 2 };
        System.out.println(maxProfitOfOneTransaction(List.of(1, 4, 2)));
        System.out.println(maxProfitLatestInterval(List.of(1, 4, 2)));
        System.out.println(maxProfit(prices4));

        int[] prices5 = { 2, 1, 4 };
        System.out.println(maxProfitOfOneTransaction(List.of(2, 1, 4)));
        System.out.println(maxProfitLatestInterval(List.of(2, 1, 4)));
        System.out.println(maxProfit(prices5));

        int[] prices6 = { 3,2,6,5,0,3 };
        System.out.println(maxProfitOfOneTransaction(List.of(3,2,6,5,0,3)));
        System.out.println(maxProfitLatestInterval(List.of(3,2,6,5,0,3)));
        System.out.println(maxProfit(prices6));

        int[] prices7 = { 3,2,6,5 };
        System.out.println(maxProfitOfOneTransaction(List.of(3,2,6,5)));
        System.out.println(maxProfitLatestInterval(List.of(3,2,6,5)));
        System.out.println(maxProfit(prices7));
    }
}