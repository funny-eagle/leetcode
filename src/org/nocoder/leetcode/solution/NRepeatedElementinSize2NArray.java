package org.nocoder.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 961. N-Repeated Element in Size 2N Array
 * <p>
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * <p>
 * Return the element repeated N times.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,1,2,5,3,2]
 * Output: 2
 * Example 3:
 * <p>
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 * <p>
 * <p>
 * Note:
 * <p>
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 *
 * @author jason
 * @date 2019/2/17.
 */
public class NRepeatedElementinSize2NArray {

    public static int repeatedNTimes(int[] arr) {
        // 4 <= A.length <= 10000, A.length is even
        if (arr == null || (arr.length < 4 || arr.length > 10000) || (arr.length % 2 != 0)) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] >= 10000) {
                throw new IllegalArgumentException();
            }
            if (elements.put(arr[i], 1) != null) {
                return arr[i];
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(arr));
    }
}
