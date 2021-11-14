package com;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see AlmostEquivalentString.checkAlmostEquivalent
 */
public class AlmostEquivalentStringTest {
  @Test
  void testCheckAlmostEquivalent() {
    assertFalse(AlmostEquivalentString.checkAlmostEquivalent("aaaa", "bdce"));
  }
}
