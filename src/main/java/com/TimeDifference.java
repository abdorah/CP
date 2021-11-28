package com;

import java.util.List;

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
            .toList();
    int min = 1440;
    int best = 1440;
    int length = times.size() - 1;
    for (int i = 0; i < length; i++) {
      min =
          Math.min(
              (times.get(i + 1) - times.get(i) > 720
                  ? 1440 - (times.get(i + 1) - times.get(i))
                  : (times.get(i + 1) - times.get(i))),
              min);
      best = Math.min(best, min);
    }
    return Math.min(
        (times.get(length) - times.get(0) > 720
            ? 1440 - (times.get(length) - times.get(0))
            : (times.get(length) - times.get(0))),
        best);
  }
}
