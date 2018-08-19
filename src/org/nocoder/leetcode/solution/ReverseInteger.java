package org.nocoder.leetcode.solution;

/**
 * 7. Reverse Integer
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
 * range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the
 * reversed integer overflows.
 *
 * @author jason
 * @date 18/8/18.
 */
public class ReverseInteger {
    private static int INT_MAX = 2147483647;
    private static int INT_MIN = -INT_MAX - 1;

    public static int reverse(int x) {
        int y = 0;
        int n;
        while (x != 0) {
            n = x % 10;
            if (y > INT_MAX / 10 || y < INT_MIN / 10) {
                return 0;
            }
            y = y * 10 + n;
            x = x / 10;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(0));
        System.out.println(reverse(1000000003));
    }
}
