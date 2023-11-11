package com;

/**
 * Cyclone
 *
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see <a href="https://leetcode.com/problems/kth-distinct-string-in-an-array/"><b>Leetcode-2053.
 *     Kth Distinct String in an Array</b></a>
 */
public class DistinctString {

  /**
   * @param array Input array of strings to check if they are distinct.
   * @param index The index of the string to compare against.
   * @return True if the String at the @param index is distinct
   */
  public static boolean isDistinct(String[] array, int index) {
    int num = 0;
    for (String string : array) {
      if (num > 1) return false;
      if (string.equals(array[index])) num++;
    }
    return (num == 1);
  }

  /**
   * @param arr Input array of strings to check if they are distinct.
   * @param k The index of the string to compare against.
   * @return The @param k th distinct String in @param arr
   */
  public static String kthDistinct(String[] arr, int k) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (!isDistinct(arr, i)) {
        continue;
      } else {
        ++count;
      }
      if (count == k) {
        return arr[i];
      }
    }
    return "";
  }
}
