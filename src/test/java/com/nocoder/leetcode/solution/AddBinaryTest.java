package com.nocoder.leetcode.solution;

import org.junit.Test;
import org.nocoder.leetcode.solution.AddBinary;

/**
 * @author yangjl
 * @description
 * @date 2023-05-19 15:32
 **/
public class AddBinaryTest {
    @Test
    public void test(){
        AddBinary solution = new AddBinary();
        System.out.println(solution.addBinary("11", "11"));
        System.out.println(solution.addBinary("1010", "1011"));
        System.out.println(solution.addBinary("100","101"));
        System.out.println(solution.addBinary("11","1"));
    }

}
