package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Snowflake
 *
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see <a
 *     href="https://leetcode.com/problems/eliminate-maximum-number-of-monsters/description/?envType=daily-question&envId=2023-11-07"><b>Leetcode-1921.
 *     Eliminate Maximum Number of Monsters</b></a>
 */
public class EliminateMaxMonster {

  /**
   * This method follows the iterative approach of killing monsters as long as we have bullets.
   *
   * @param dist Array wherein the index i represents the initial distance from the monster i.
   * @param speed Array of speed of every monster.
   * @return The number of cycles in the game before losing or wining.
   */
  public static int eliminateMaximum(int[] dist, int[] speed) {
    int current = 0;

    List<Integer> cycles =
        new ArrayList<>(
            IntStream.range(0, dist.length)
                .map(i -> dist[i] % speed[i] > 0 ? dist[i] / speed[i] + 1 : dist[i] / speed[i])
                .sorted()
                .boxed()
                .collect(Collectors.toList()));
    for (int cycle : cycles) {
      if (cycle > current) {
        current++;
      } else if (cycle == current) {
        break;
      }
    }
    return current;
  }
}
