package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class DistinctString {

  /**
   * @param array
   * @param index
   * @return true if the String at the @param index is distinct
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
   * @param arr
   * @param k
   * @return the @param k th distinct String in @param arr
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
