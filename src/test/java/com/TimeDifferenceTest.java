package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see TimeDifference.findMinDifference
 */
public class TimeDifferenceTest {
  @Test
  void testFindMinDifference0() {
    var timePoints = Arrays.asList(new String[] {"00:00", "23:59", "00:00"});
    assertEquals(0, TimeDifference.findMinDifference(timePoints));
  }

  @Test
  void testFindMinDifference1() {
    var timePoints = Arrays.asList(new String[] {"01:01", "02:01"});
    assertEquals(60, TimeDifference.findMinDifference(timePoints));
  }

  @Test
  void testFindMinDifference2() {
    var timePoints = Arrays.asList(new String[] {"00:00", "04:00", "22:00"});
    assertEquals(120, TimeDifference.findMinDifference(timePoints));
  }

  @Test
  void testFindMinDifference3() {
    var timePoints = Arrays.asList(new String[] {"12:12", "00:13"});
    assertEquals(719, TimeDifference.findMinDifference(timePoints));
  }
}
