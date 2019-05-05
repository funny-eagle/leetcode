package org.nocoder.leetcode.solution.common;

/**
 * @author jason
 * @date 2019/1/19.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode.next != null) {
                System.out.print(" -> ");
            }
            listNode = listNode.next;
        }
        System.out.println();
    }
}
