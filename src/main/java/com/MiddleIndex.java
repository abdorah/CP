package com;

import java.util.Arrays;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class MiddleIndex {

  /**
   * @param nums
   * @return the index of the number in nums for which the sum of numbers on its left equals the sum
   *     on its right
   */
  public static int findMiddleIndex(int[] nums) {
    int leftSum = 0;
    int rightSum = Arrays.stream(nums).skip(1).sum();
    if (leftSum == rightSum) {
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      leftSum += nums[i - 1];
      rightSum -= nums[i];
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
}
