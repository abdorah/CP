package com;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class TimeDifference {

  /**
   * @param timePoints
   * @return the Minimum difference between two time points
   */
  public static int findMinDifference(List<String> timePoints) {
    var times =
        timePoints.stream()
            .map(
                (t) -> {
                  return (Integer.parseInt(t.split(":")[0]) * 60)
                      + Integer.parseInt(t.split(":")[1]);
                })
            .sorted()
            .collect(Collectors.toList());
    int min = 1440;
    int best = 1440;
    for (int i = 0; i < times.size() - 1; i++) {
      for (int j = i + 1; j < times.size(); j++) {
        min =
            Math.min(
                (times.get(j) - times.get(i) > 720
                    ? 1440 - (times.get(j) - times.get(i))
                    : (times.get(j) - times.get(i))),
                min);
        best = Math.min(best, min);
      }
    }
    return best;
  }
}
