package org.nocoder.leetcode.solution.common;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;


    public TreeNode(int val) {
        this.val = val;
    }

    public void print() {
        System.out.println("val: " + this.val);
        System.out.println("left: " + this.left.val);
        System.out.println("right: " + this.right.val);
    }
}