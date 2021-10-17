package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see MaxConsecutiveAnswers.maxConsecutiveAnswers
 */
public class MaxConsecutiveAnswersTest {
  @Test
  void testMaxConsecutiveAnswers() {
    assertEquals(8, MaxConsecutiveAnswers.maxConsecutiveAnswers("FFFTTFTTFT", 3));
  }
}
