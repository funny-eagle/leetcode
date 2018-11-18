package org.nocoder.leetcode.solution;

import java.util.Stack;

/**
 * 344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example 1:
 * <p>
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 *
 * @author jason
 * @date 2018/11/4.
 */
public class ReverseString {
    public static String reverseString(String s) {
        if (s == null || s == "") {
            return null;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        int len = stack.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("A man, a plan, a canal: Panama"));
    }
}
