package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see EliminateMaxMonster.eliminateMaximum
 */
public class EliminateMaxMonsterTest {

  @Test
  void testZeroKilled() {
    assertEquals(1, EliminateMaxMonster.eliminateMaximum(new int[] {3, 2, 4}, new int[] {5, 3, 2}));
  }

  @Test
  void testAllKilled() {
    assertEquals(3, EliminateMaxMonster.eliminateMaximum(new int[] {1, 3, 4}, new int[] {1, 1, 1}));
  }

  @Test
  void testTwoKilled() {
    assertEquals(
        1, EliminateMaxMonster.eliminateMaximum(new int[] {1, 1, 2, 3}, new int[] {1, 1, 1, 1}));
  }

  @Test
  void testThreeKilled() {
    assertEquals(3, EliminateMaxMonster.eliminateMaximum(new int[] {4, 2, 3}, new int[] {2, 1, 1}));
  }
}
