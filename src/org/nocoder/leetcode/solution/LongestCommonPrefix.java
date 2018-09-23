package org.nocoder.leetcode.solution;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 *
 * @author jason
 * @date 2018/9/23.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        if (strs == null || strs.length == 0) {
            return commonPrefix;
        }

        if (strs.length == 1) {
            commonPrefix = strs[0];
            return commonPrefix;
        }

        // i: 代表数组下标
        int i = 0;
        // x: 数组元素中的字符串的下标
        int x = 0;
        while (i < strs.length) {
            if ((x + 1) > strs[i].length() || (x + 1) > strs[i + 1].length()) {
                return commonPrefix;
            }
            // 获取数组中下标为i字符串,并截取(x, x+1)位置的字符
            String s = strs[i].substring(x, x + 1);
            // 将s与下一个字符串中的相同位置的字符进行比较
            if (s.equals(strs[i + 1].substring(x, x + 1))) {
                if ((i + 1) == (strs.length - 1)) {
                    commonPrefix += s;
                    // 字符串下标右移一位
                    x++;
                    // 重置数组下标
                    i = 0;
                } else {
                    i++;
                }
            } else {
                return commonPrefix;
            }
        }
        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] arr1 = new String[]{"flower", "flow", "flight"};
        String[] arr2 = new String[]{"a", "a"};
        System.out.println(longestCommonPrefix(arr1));
        System.out.println(longestCommonPrefix(arr2));
    }
}
