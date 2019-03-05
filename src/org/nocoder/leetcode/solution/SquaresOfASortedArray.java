package org.nocoder.leetcode.solution;

import java.util.List;

/**
 * 977. Squares of a Sorted Array
 * <p>
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 * <p>
 * Example 1:
 * <p>
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * <p>
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 *
 * @author yangjinlong
 */
public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{-4, -1, 0, 3, 10};
        sortedSquares(arr);
    }

    public static int[] sortedSquares(int[] A) {
        int[] arr = powArray(A);
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static int[] powArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        return arr;
    }

    private static void sort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                ++i;
            }
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        sort(arr, head, j);
        sort(arr, i, tail);
    }

}
