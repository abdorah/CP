package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see CapitilizedString.capitalizeTitle
 */
public class CapitilizedStringTest {
  @Test
  void testCapitalizeTitle() {
    assertEquals("Capitalize The Title", CapitilizedString.capitalizeTitle("capiTalIze tHe titLe"));
  }
}
