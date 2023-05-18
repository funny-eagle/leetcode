package org.nocoder.leetcode.solution;

/**
 * https://leetcode.com/problems/plus-one/
 *
 * @author yangjl
 * @date 2021-06-28
 */
@SuppressWarnings("ALL")
public class PlusOne {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length > 100) {
            return null;
        }
        // 8, 7, 6, 9
        int x = digits[digits.length - 1] + 1;
        int carry = 0;
        if (x > 9) {
            x = 0; //末位
            carry = 1; // 进位
        }
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }
}
