package com.nocoder.leetcode.solution;

import org.junit.Test;
import org.nocoder.leetcode.solution.PlusOne;

/**
 * @author yangjl
 * @description unit test
 * @date 2023-05-18 17:07
 **/

public class PlusOneTest {

    @Test
    public void testPlusOne(){
        PlusOne plusOne = new PlusOne();
        int[] res = plusOne.plusOne(new int[]{1, 2, 3});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
