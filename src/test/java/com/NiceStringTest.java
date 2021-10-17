package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see NiceString.longestNiceSubstring
 */
public class NiceStringTest {

  @Test
  public void shouldAnswerWithTrue() {
    assertEquals(NiceString.longestNiceSubstring("MMmmsdflsmjfsmskkkkkkkkkKsj"), "kkkkkkkkkK");
  }
}
