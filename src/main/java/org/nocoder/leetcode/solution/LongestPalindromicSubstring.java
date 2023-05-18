package org.nocoder.leetcode.solution;

/**
 * 5. Longest Palindromic Substring
 * <p>
 * Given a string s, find the longest palindromic substring in s.
 * <p>
 * You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * <p>
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 *
 * @author jason
 * @date 18/8/4.
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        boolean[][] palindrome = new boolean[s.length()][s.length()];
        String result = "";
        int maxLength = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if ((s.charAt(i) == s.charAt(j)) && (j - i <= 2 || palindrome[i + 1][j - 1])) {
                    palindrome[i][j] = true;
                    if (maxLength < j - i + 1) {
                        maxLength = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LongestPalindromicSubstring.longestPalindrome("a"));
        System.out.println(LongestPalindromicSubstring.longestPalindrome("aa"));
        System.out.println(LongestPalindromicSubstring.longestPalindrome("aaa"));
        System.out.println(LongestPalindromicSubstring.longestPalindrome("cbbd"));
        System.out.println(LongestPalindromicSubstring.longestPalindrome("babad"));
    }
}
