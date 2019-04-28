package org.nocoder.leetcode.solution;

/**
 * 136. Single Number
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @author yangjinlong
 * @date 2018-12-06
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 2, 1};
        int[] arr2 = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
    }
}
