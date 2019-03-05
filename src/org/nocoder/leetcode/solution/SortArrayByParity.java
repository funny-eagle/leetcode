package org.nocoder.leetcode.solution;

/**
 * 905. Sort Array By Parity
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 * @author jason
 * @date 2019/2/25.
 */
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sortedArray[idx++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sortedArray[idx++] = arr[i];
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4};
        sortArrayByParity(arr);
    }
}
