package org.nocoder.leetcode.solution;


/**
 * 563. Binary Tree Tilt
 * https://leetcode.com/problems/binary-tree-tilt/
 * @author jason
 * @date 2019/5/16.
 */
public class BinaryTreeTilt {
    static int tilt = 0;
    public static int findTilt(TreeNode root){
        calNodeTilt(root);
        return tilt;
    }

    private static int calNodeTilt(TreeNode cur) {
        if(cur == null){
            return 0;
        }
        int lt = calNodeTilt(cur.left);
        int rt = calNodeTilt(cur.right);
        tilt += Math.abs(lt-rt);
        return lt + rt + cur.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(findTilt(root));
    }
}
