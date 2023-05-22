package org.nocoder.leetcode.solution;

/**
 * AddBinary https://leetcode.com/problems/add-binary/
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

        // 两个字符串长度查，在短字符串前面补领0，方便计算
        int d = a.length() - b.length();
        String prefix = "";
        for (int i = 0; i < Math.abs(d); i++)
            prefix += "0";

        // 参数前面补0
        if (d > 0)
            b = prefix + b;
        else
            a = prefix + a;

        String[] aa = a.split("");
        String[] bb = b.split("");
        // 用字符串数组来存储结果，长度用aa和bb的都可以
        String[] res = new String[aa.length];

        // carry表示进位值
        String carry = "0";

        // 从末位开始相加
        for (int i = aa.length - 1; i >= 0; i--) {
            String sum = carry + aa[i] + bb[i];

            if ("000".equals(sum)) {
                res[i] = "0";
                carry = "0";
            }

            if ("001".equals(sum) || "010".equals(sum) || "100".equals(sum)) {
                res[i] = "1";
                carry = "0";
            }

            if ("101".equals(sum) || "110".equals(sum) || "011".equals(sum)) {
                res[i] = "0";
                carry = "1";
            }

            if ("111".equals(sum)) {
                res[i] = "1";
                carry = "1";
            }

            // 计算到数组首位时，依然有进位，需要变长数组，长度+1，首位赋值为1
            if (i == 0 && "1".equals(carry)) {
                // step1. 暂存res到temp
                String[] tem = res;
                // step2. 新建一个比原数组长度+1的数组
                res = new String[aa.length + 1];
                // step3. 首位赋值为1
                res[0] = "1";
                // step4. 把原数组内容复制过来，下标从1开始复制
                for (int i1 = 1; i1 < res.length; i1++)
                    res[i1] = tem[i1 - 1];
            }

        }

        String result = new String();
        for (int i = 0; i < res.length; i++)
            result += res[i];

        return result;
    }
}
