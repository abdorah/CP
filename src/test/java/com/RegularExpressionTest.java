package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see RegularExpression.isMatch
 */
public class RegularExpressionTest {

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(RegularExpression.isMatch("aaa", "a*aaa"));
  }
}
