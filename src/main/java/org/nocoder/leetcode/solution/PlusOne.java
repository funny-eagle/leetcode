package org.nocoder.leetcode.solution;

/**
 * https://leetcode.com/problems/plus-one/
 *
 * @author yangjl
 * @date 2021-06-28
 */
@SuppressWarnings("ALL")
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length > 100) {
            throw new RuntimeException("invalid parameters");
        }

        int[] res = digits;


        int carry = 0;//进位
        for (int i = res.length - 1; i >= 0; i--) {
            int t;
            if (i == res.length - 1) {
                // 末位加1
                t = res[i] + 1;
            } else {
                // 非末位加进位值
                t = res[i] + carry;
                carry = 0;// 重置进位值
            }

            if (t > 9) {
                t = 0;
                carry = 1; // 进位
                // 如果首位是9，且进位值是1，就扩容数组，在首位补0，供进位使用
                if (i == 0 && res[0] == 9 && carry == 1) {
                    res = new int[res.length + 1];
                    for (int j = 1; j < res.length; j++) {
                        res[i] = res[j - 1];
                    }
                    res[0] = 1;
                    continue;
                }
            }
            res[i] = t;
        }

        return res;
    }

}
