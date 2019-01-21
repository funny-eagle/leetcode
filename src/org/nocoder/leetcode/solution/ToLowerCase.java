package org.nocoder.leetcode.solution;

/**
 * 709. To Lower Case
 * <p>
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 */
public class ToLowerCase {
    public static String toLowerCase(String str) {
        StringBuilder lowerCase = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int n = chars[i];
            if (n >= 65 && n <= 90) {
                n += 32;
                lowerCase.append((char) n);
            } else {
                lowerCase.append((char) n);
            }
        }
        return lowerCase.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }
}
