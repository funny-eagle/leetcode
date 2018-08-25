package org.nocoder.leetcode.solution;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 * <p>
 * 8. String to Integer (atoi)
 * <p>
 * Implement atoi which converts a string to an integer.
 * <p>
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
 * Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as
 * possible, and interprets them as a numerical value.
 * <p>
 * The string can contain additional characters after those that form the integral number, which are ignored and have no
 * effect on the behavior of this function.
 * <p>
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists
 * because either str is empty or it contains only whitespace characters, no conversion is performed.
 * <p>
 * If no valid conversion could be performed, a zero value is returned.
 * <p>
 * Note:
 * <p>
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−2 31,  2 31 − 1]. If the numerical value is out of the range of representable values, INT_MAX (2 31 − 1) or
 * INT_MIN (−2 31) is returned.
 * Example 1:
 * <p>
 * Input: "42"
 * Output: 42
 * Example 2:
 * <p>
 * Input: "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 * Then take as many numerical digits as possible, which gets 42.
 * Example 3:
 * <p>
 * Input: "4193 with words"
 * Output: 4193
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 * Example 4:
 * <p>
 * Input: "words and 987"
 * Output: 0
 * Explanation: The first non-whitespace character is 'w', which is not a numerical
 * digit or a +/- sign. Therefore no valid conversion could be performed.
 * Example 5:
 * <p>
 * Input: "-91283472332"
 * Output: -2147483648
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
 * Thefore INT_MIN (−231) is returned.
 *
 * @author jason
 * @date 18/8/26.
 */
public class StringToInteger {

    public static int myAtoi(String str) {
        if (str == null || "".equals(str = str.trim())) {
            return 0;
        }

        // 字母开头
        if (str.matches("^[a-zA-Z]\\w{0,31}$")) {
            return 0;
        }

        int i = 0;
        char flag = '+';
        // 判断正负
        if (str.charAt(i) == '-'){
            flag = '-';
            i++;
        } else if (str.charAt(i) == '+') {
            flag = '+';
            i++;
        }

        double result = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {//计算对应的整数
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-') {
            result = -result;
        }

        // 越界处理
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("123abc"));
        System.out.println(myAtoi("  "));
        System.out.println(myAtoi(null));
        System.out.println(myAtoi("hello123"));
        System.out.println(myAtoi("9999999999999999999999999"));
        System.out.println(myAtoi("-9999999999999999999999999"));
        System.out.println(myAtoi("1000"));
        System.out.println(myAtoi("0001"));
        System.out.println(myAtoi("-888"));
        System.out.println(myAtoi("   9999    2222"));
    }
}
