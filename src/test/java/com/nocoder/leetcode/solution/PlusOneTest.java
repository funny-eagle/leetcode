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

        System.out.println();
        int[] res1 = plusOne.plusOne(new int[]{8, 9, 9});
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println();

        int[] res2 = plusOne.plusOne(new int[]{9, 9});
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
        System.out.println();



        int[] res3 = plusOne.plusOne(new int[]{9});
        for (int i = 0; i < res3.length; i++) {
            System.out.print(res3[i] + " ");
        }

        System.out.println();

        int[] res4 = plusOne.plusOne(new int[]{0,9});
        for (int i = 0; i < res4.length; i++) {
            System.out.print(res4[i] + " ");
        }

        System.out.println();

        int[] res5 = plusOne.plusOne(new int[]{9, 8, 9, 9});
        for (int i = 0; i < res5.length; i++) {
            System.out.print(res5[i] + " ");
        }
        System.out.println();


    }
}
