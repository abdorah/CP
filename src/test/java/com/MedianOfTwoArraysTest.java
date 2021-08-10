package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MedianOfTwoArraysTest {

    @Test
    public void shouldReturnTheMedianOfTwoArrays() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        assertEquals(2.5, MedianOfTwoArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void shouldReturnTheMedianOfTwoArrays1() {
        int[] nums1 = {};
        int[] nums2 = { 1 };
        assertEquals(1.0, MedianOfTwoArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void shouldReturnTheMedianOfTwoArrays2() {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        assertEquals(2.0, MedianOfTwoArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void shouldReturnTheMedianOfTwoArrays3() {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 7 };
        assertEquals(2.5, MedianOfTwoArrays.findMedianSortedArrays(nums1, nums2));
    }
}
