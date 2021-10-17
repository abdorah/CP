package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class PhoneNumberTest {
  @Test
  void testCreatePhoneNumber() {
    assertEquals(
        "(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}
