package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see MaximumMatrixSum.maxMatrixSum
 */
public class MaximumMatrixSumTest {
  @Test
  void testMaxMatrixSum() {
    int[][] matrix = new int[][] {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
    assertEquals(16, MaximumMatrixSum.maxMatrixSum(matrix));
  }
}
