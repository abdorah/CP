package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see FancyCharacter.makeFancyString
 */
public class FancyCharacterTest {
  @Test
  void testMakeFancyString() {
    assertEquals("leetcode", FancyCharacter.makeFancyString("leeetcode"));
  }
}
