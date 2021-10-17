package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see MaxProfitTransactions.maxProfit
 */
public class MaxProfitTransactionsTest {

  @Test
  public void TestCaseZeroShouldAnswerWithTrue() {
    int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
    assertEquals(6, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseOneShouldAnswerWithTrue() {
    int[] prices = {1, 2, 3, 4, 5};
    assertEquals(4, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseTwoShouldAnswerWithTrue() {
    int[] prices = {1};
    assertEquals(0, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseThreeShouldAnswerWithTrue() {
    int[] prices = {2, 1, 2, 0, 1};
    assertEquals(2, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseFourShouldAnswerWithTrue() {
    int[] prices = {1, 4, 2};
    assertEquals(3, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseFiveShouldAnswerWithTrue() {
    int[] prices = {2, 1, 4};
    assertEquals(3, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseSixShouldAnswerWithTrue() {
    int[] prices = {3, 2, 6, 5, 0, 3};
    assertEquals(7, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseSevenShouldAnswerWithTrue() {
    int[] prices = {3, 2, 6, 5};
    assertEquals(4, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseEightShouldAnswerWithTrue() {
    int[] prices = {2, 1, 4, 5, 2, 9, 7};
    assertEquals(11, MaxProfitTransactions.maxProfit(prices));
  }

  @Test
  public void TestCaseNineShouldAnswerWithTrue() {
    int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
    assertEquals(13, MaxProfitTransactions.maxProfit(prices));
  }
}
