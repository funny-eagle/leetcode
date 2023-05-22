package org.nocoder.leetcode.solution;

/**
 * AddBinary
 * <p>
 * Given two binary strings a and b, return their sum as a binary string.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * Constraints:
 * <p>
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 * Related Topics
 * Math
 * String
 * Bit Manipulation
 * Simulation
 *
 * @author yangjl
 * @description
 * @date 2023-05-19 15:31
 **/
public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || b == null || a.length() > 10000 || b.length() > 10000)
            throw new RuntimeException("invalid parameters");

        int d = a.length() - b.length();
        String prefix = "";
        for (int i = 0; i < Math.abs(d); i++)
            prefix += "0";

        // 参数前面补0
        if (d > 0)
            b = prefix + b;
        else
            a = prefix + a;

//        System.out.println("a="+a + ", b=" + b);

        String[] aa = a.split("");
        String[] bb = b.split("");
        String[] res = new String[aa.length];
        String carry = "0";

        for (int i = aa.length - 1; i >= 0; i--) {
//            System.out.println(carry + " " + aa[i] + " " + bb[i]);
            String sum = carry + aa[i] + bb[i];


            if ("001".equals(sum) || "010".equals(sum) || "100".equals(sum)) {
                res[i] = "1";
                carry = "0";
            }

            if ("101".equals(sum) || "110".equals(sum)) {
                res[i] = "0";
                carry = "1";
            }

            if ("000".equals(sum)) {
                res[i] = "0";
                carry = "0";
            }

            if ("011".equals(sum)) {
                res[i] = "0";
                carry = "1";
            }

            if ("111".equals(sum)) {
                res[i] = "1";
                carry = "1";
            }

            if (i == 0 && "1".equals(carry)) {
                String[] tem = res;
                res = new String[aa.length + 1];
                res[0] = "1";
                for (int i1 = 1; i1 < res.length; i1++) {
                    res[i1] = tem[i1 - 1];
                }

            }


        }

        String result = new String();
        for (int i = 0; i < res.length; i++) {
            result += res[i];
        }

        return result;
    }
}
