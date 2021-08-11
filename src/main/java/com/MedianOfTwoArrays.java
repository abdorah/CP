package com;

import java.util.stream.IntStream;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class MedianOfTwoArrays {

    /**
     * @param nums1
     * @param nums2
     * @return the median of two sorted arrays
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] arr = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).sorted().toArray();
        if (length % 2 == 0) {
            double result = (arr[length / 2] + arr[(length / 2) - 1]);
            return result / 2;
        } else {
            return arr[(length - 1) / 2];
        }
    }
}
