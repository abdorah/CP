package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxProfitTransactionsTest {

    @Test
    public void TestCaseZeroShouldAnswerWithTrue() {
        int[] prices0 = { 3, 3, 5, 0, 0, 3, 1, 4 };
        assertEquals(6, MaxProfitTransactions.maxProfit(prices0));
    }

    @Test
    public void TestCaseOneShouldAnswerWithTrue() {
        int[] prices1 = { 1, 2, 3, 4, 5 };
        assertEquals(4, MaxProfitTransactions.maxProfit(prices1));
    }

    @Test
    public void TestCaseTwoShouldAnswerWithTrue() {
        int[] prices2 = { 1 };
        assertEquals(0, MaxProfitTransactions.maxProfit(prices2));
    }

    @Test
    public void TestCaseThreeShouldAnswerWithTrue() {
        int[] prices3 = { 2, 1, 2, 0, 1 };
        assertEquals(2, MaxProfitTransactions.maxProfit(prices3));
    }

    @Test
    public void TestCaseFourShouldAnswerWithTrue() {
        int[] prices4 = { 1, 4, 2 };
        assertEquals(3, MaxProfitTransactions.maxProfit(prices4));
    }

    @Test
    public void TestCaseFiveShouldAnswerWithTrue() {
        int[] prices5 = { 2, 1, 4 };
        assertEquals(3, MaxProfitTransactions.maxProfit(prices5));
    }

    @Test
    public void TestCaseSixShouldAnswerWithTrue() {
        int[] prices6 = { 3, 2, 6, 5, 0, 3 };
        assertEquals(7, MaxProfitTransactions.maxProfit(prices6));

    }

    @Test
    public void TestCaseSevenShouldAnswerWithTrue() {
        int[] prices7 = { 3, 2, 6, 5 };
        assertEquals(4, MaxProfitTransactions.maxProfit(prices7));

    }

    @Test
    public void TestCaseEightShouldAnswerWithTrue() {
        int[] prices7 = { 2, 1, 4, 5, 2, 9, 7 };
        assertEquals(11, MaxProfitTransactions.maxProfit(prices7));

    }

    @Test
    public void TestCaseNineShouldAnswerWithTrue() {
        int[] prices7 = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 };
        assertEquals(13, MaxProfitTransactions.maxProfit(prices7));

    }
}