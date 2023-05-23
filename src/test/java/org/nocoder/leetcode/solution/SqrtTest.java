package org.nocoder.leetcode.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(2, sqrt.mySqrt(8));
        assertEquals(15, sqrt.mySqrt(230));
        assertEquals(46340, sqrt.mySqrt(2147395600));
    }


} 
