package org.nocoder.leetcode.solution;

/**
 * 69. Sqrt(X) Easy
 * <p>
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * Example 1:
 * <p>
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 * <p>
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 * Constraints:
 * <p>
 * 0 <= x <= 231 - 1
 * Related Topics
 * Math
 * Binary Search
 *
 * @author yangjl
 * @description my sqrt
 * @date 2023-05-22 11:44
 **/
public class Sqrt {
    public int mySqrt(int x) {
        long r = 1;
        while (r * r <= x) {
            r += 1;
        }
        return (int)r - 1;
    }
}
