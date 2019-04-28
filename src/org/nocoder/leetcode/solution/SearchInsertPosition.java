package org.nocoder.leetcode.solution;

/**
 * 35. Search Insert Position
 * <p>
 * Given a sorted array and a target value, return the index if the target is found.
 * <p>
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 * @author jason
 * @date 2019/3/23.
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int t1 = 4;
        System.out.println(searchInsert(nums, t1));
        int t2 = 2;
        System.out.println(searchInsert(nums, t2));
        int t3 = 7;
        System.out.println(searchInsert(nums, t3));
        int t4 = 0;
        System.out.println(searchInsert(nums, t4));
    }

    /**
     * 使用二分法，查找目标数的位置，
     * 如果在数组中找到了目标数，则返回目标数的下标；
     * 如果找不到目标数，则返回最后一次循环结束后的开始位置(即 start 的值)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            System.out.println("middle: " + middle);
            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return start;
    }
}
