package org.nocoder.leetcode.solution;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 * <p>
 * Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.
 * <p>
 * If it is impossible to form any triangle of non-zero area, return 0.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,1,2]
 * Output: 5
 * Example 2:
 * <p>
 * Input: [1,2,1]
 * Output: 0
 * Example 3:
 * <p>
 * Input: [3,2,3,4]
 * Output: 10
 * Example 4:
 * <p>
 * Input: [3,6,2,3]
 * Output: 8
 * <p>
 * <p>
 * Note:
 * <p>
 * 3 <= A.length <= 10000
 * 1 <= A[i] <= 10^6
 *
 * @author jason
 * @date 2019/1/19.
 */
public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 3; i >= 0; --i) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                return arr[i] + arr[i + 1] + arr[i + 2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LargestPerimeterTriangle lpt = new LargestPerimeterTriangle();
        System.out.println(lpt.largestPerimeter(new int[]{3, 6, 2, 3}));
    }
}
