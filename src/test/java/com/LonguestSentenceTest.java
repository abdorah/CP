package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see LonguestSentence.mostWordsFound
 */
public class LonguestSentenceTest {
  @Test
  void testMostWordsFound() {
    String[] sentences =
        new String[] {
          "alice and bob love leetcode", "i think so too", "this is great thanks very much"
        };
    assertEquals(6, LonguestSentence.mostWordsFound(sentences));
  }
}
