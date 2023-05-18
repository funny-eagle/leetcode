package org.nocoder.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/contains-duplicate/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=jmuynpv
 * <p>
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * <p>
 * 示例 1：
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,3,4]
 * 输出：false
 * <p>
 * 示例 3：
 * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
 * 输出：true
 * <p>
 * 提示：
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 *
 * @author yangjl
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length > Math.pow(10, 5) || nums.length == 0) {
            throw new RuntimeException("params is not valid!");
        }

        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (count > 1) {
                    return true;
                }
                if (num == i) {
                    count += 1;
                }
            }

        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        if (nums == null || nums.length > Math.pow(10, 5) || nums.length == 0) {
            throw new RuntimeException("params is not valid!");
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if(set.size() != nums.length){
            return true;
        }
        return false;
    }

}
