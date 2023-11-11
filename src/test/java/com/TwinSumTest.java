package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see TwinSum.pairSum
 */
public class TwinSumTest {
  @Test
  void testPairSum() {
    assertEquals(
        4,
        TwinSum.pairSum(
            new TwinSum.ListNode(3, new TwinSum.ListNode(2, new TwinSum.ListNode(1, null)))));
  }
}
