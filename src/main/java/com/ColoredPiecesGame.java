package com;

/**
 * Cyclone
 *
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see <a
 *     href="https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/"><b>Leetcode-2038.
 *     Remove Colored Pieces if Both Neighbors are the Same Color </b></a>
 */
public class ColoredPiecesGame {

  /**
   * @param colors The input string of colors.
   * @return True if the winner is 'A' (Alice) is the winner, and false if 'B' (Bobe) is the winner.
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
