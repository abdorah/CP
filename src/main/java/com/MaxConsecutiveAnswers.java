package com;

import java.util.LinkedList;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class MaxConsecutiveAnswers {

  /**
   * @param answerKey
   * @param k
   * @return the length of the longest sequence possible
   */
  public static int maxConsecutiveAnswers(String answerKey, int k) {
    return Math.max(flipper(answerKey, k, 'F'), flipper(answerKey, k, 'T'));
  }

  /**
   * @param answerKey
   * @param k
   * @param countLetter either 'T' or 'F'
   * @return the length of the longest sequence possible of counterLetter
   */
  public static int flipper(String answerKey, int k, char countLetter) {
    int max = 0;
    int count = 0;
    LinkedList<Integer> queue = new LinkedList<>();
    for (int i = 0; i < answerKey.length(); i++) {
      char letter = answerKey.charAt(i);
      if (letter == countLetter) count++;
      else if (k > 0) {
        queue.add(i);
        k--;
        count++;
      } else {
        queue.add(i);
        max = Math.max(count, max);
        count = i - queue.removeFirst();
      }
    }
    max = Math.max(count, max);
    return max;
  }
}
