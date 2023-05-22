package org.nocoder.leetcode.solution;

import org.junit.Test;

/**
 * Sqrt Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>5月 22, 2023</pre>
 */
public class SqrtTest {

    /**
     * Method: mySqrt(int x)
     */
    @Test
    public void testMySqrt() throws Exception {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(8));
        System.out.println(sqrt.mySqrt(230));
        System.out.println(sqrt.mySqrt(2147395600));
    }


} 
