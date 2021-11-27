package com;

import java.util.Arrays;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class OneOccurenceCommonWords {

  /**
   * @param words
   * @param word
   * @return the number of occurences of the String word of the array of Strings words
   */
  public static int numberOfOcurences(String[] words, String word) {
    return (int) Arrays.asList(words).stream().filter(p -> p.equals(word)).count();
  }

  /**
   * @param words1
   * @param words2
   * @return the number of Strings that exist in both words1 and words2 only once exactly
   */
  public static int countWords(String[] words1, String[] words2) {
    var l1 = Arrays.asList(words1);
    var l2 = Arrays.asList(words2);
    int count = 0;
    for (String c : l1) {
      if (l2.contains(c)
          && numberOfOcurences(words1, c) == 1
          && numberOfOcurences(words2, c) == 1) {
        ++count;
      }
    }
    return count;
  }
}
