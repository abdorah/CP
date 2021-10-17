package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class MinimumTimeTypeWriter {

  /**
   * @param word
   * @return the minimum time to type the String word
   */
  public static int minTimeToType(String word) {
    int time = 0;
    int x = 97 - word.charAt(0) < 0 ? 26 + 97 - word.charAt(0) : 97 - word.charAt(0);
    int y = 97 - word.charAt(0) < 0 ? word.charAt(0) - 97 : 26 + word.charAt(0) - 97;
    time = Math.min(x, y);
    ++time;
    for (int i = 1; i < word.length(); i++) {
      int a = word.charAt(i - 1);
      int b = word.charAt(i);
      x = a - b < 0 ? 26 + a - b : a - b;
      y = a - b < 0 ? b - a : 26 + b - a;
      time += Math.min(x, y);
      ++time;
    }
    return time;
  }
}
