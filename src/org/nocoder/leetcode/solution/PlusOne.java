package org.nocoder.leetcode.solution;

import java.math.BigInteger;

/**
 * https://leetcode-cn.com/problems/plus-one/
 *
 * @author yangjl
 * @date 2021-06-28
 */
public class PlusOne {

    public static void main(String[] args) {
        // int[] arr = new int[]{1, 2, 3};
        int[] arr = new int[]{0};
        int[] resArr = plusOne(arr);
        for (int i = 0; i < resArr.length; i++) {
            System.out.println(resArr[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        String arrStr = "";

        if(digits.length == 1 && digits[0] == 0){
            return new int[]{1};
        }
        for (int i = 0; i < digits.length; i++) {
            arrStr += "" + digits[i];
        }
        BigInteger bi = new BigInteger(arrStr);
        BigInteger res = bi.add(BigInteger.ONE);

        String resStr = res.toString();
        int[] resArr = new int[resStr.length()];
        for (int i = 0; i < resStr.length(); i++) {
            resArr[i] = Integer.parseInt(resStr.substring(i, i+1));
        }
        return resArr;
    }
}
