package org.nocoder.leetcode.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 70. Climbing Stairs https://leetcode.com/problems/climbing-stairs/
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 *
 * @author yangjl
 * @date 2023-05-23 10:34
 **/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        int a = 1, b = 2, c = 3;
        for (int i = 3; i <= n ; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return b;
    }

    public static void main(String [] args ){
        ClimbingStairs c = new ClimbingStairs();
        System.out.println(c.climbStairs(6));
    }

}
