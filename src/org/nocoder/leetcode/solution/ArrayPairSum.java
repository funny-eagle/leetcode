package org.nocoder.leetcode.solution;

import java.util.Arrays;

/**
 * 561. Array Partition I
 *
 * https://leetcode.com/problems/array-partition-i/
 *
 * @author jason
 * @date 2019/6/17.
 */
public class ArrayPairSum {
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i+=2) {
            max += Math.min(nums[i], nums[i+1]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 1};
        System.out.println(arrayPairSum(arr));
    }
}
