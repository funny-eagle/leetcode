package org.nocoder.leetcode.solution;

import java.util.Arrays;

/**
 * 4. Median of Two Sorted Arrays
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * <p>
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 *
 * @author jason
 * @date 18/7/27.
 */
public class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // 创建一个新数组 a， 存放nums1和nums2的元素
        int[] a = new int[m + n];

        for (int i = 0; i < m; i++) {
            a[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            a[m + j] = nums2[j];
        }

        // 数组a排序
        Arrays.sort(a);

        double result;
        int len = a.length;
        if (len == 1) {
            return a[0];
        } else if (len == 2) {
            return (a[0] + a[1]) / 2.0;
        }

        if (len % 2 == 0) {
            // 数组a的长度为偶数时，取中间的两个值，数组下标取 length/2 - 1, length/2
            result = (a[(len / 2 - 1)] + (a[len / 2])) / 2.0;
        } else {
            // 数组a的长度为基数时，取最中间的一个值返回，数组下标取 length%2
            result = a[Math.round(len / 2)];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
