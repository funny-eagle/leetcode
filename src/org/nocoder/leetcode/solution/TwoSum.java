package org.nocoder.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.Two Sum
 * https://leetcode.com/problems/two-sum/description/
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author jason
 * @date 18/7/6.
 */
public class TwoSum {

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution!");
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (resultMap.containsKey(result)) {
                return new int[]{resultMap.get(result), i};
            }
            resultMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution!");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum2(nums, target);
        System.out.println(result[0] + "," + result[1]);

        int[] nums1 = new int[]{1, 2, 9, 9};
        int target1 = 18;
        int[] result1 = twoSum2(nums1, target1);
        System.out.println(result1[0] + "," + result1[1]);
    }
}

