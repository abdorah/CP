package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class ColoredPiecesGame {

  /**
   * @param colors
   * @return true if the winner is 'A' (Alice) is the winner, and false if 'B' (Bobe) is the winner.
   */
  public static boolean winnerOfGame(String colors) {
    int aliceScore = 0;
    int bobeScore = 0;
    for (int i = 1; i < colors.length() - 1; ++i) {
      if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i + 1) == colors.charAt(i)) {
        if (colors.charAt(i) == 'A') {
          ++aliceScore;
        } else {
          ++bobeScore;
        }
      }
    }
    return aliceScore > bobeScore;
  }
}
