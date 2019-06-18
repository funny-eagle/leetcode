package org.nocoder.leetcode.solution;

import org.nocoder.leetcode.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. Binary Tree Preorder Traversal
 *
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 *
 * @author jason
 * @date 2019/6/18.
 */
public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }

            if(node.left != null){
                stack.push(node.left);
            }
        }

        return list;
    }

    public static TreeNode buildTreeNode() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        return root;
    }

    public static void main(String[] args) {
        List<Integer> list = preorderTraversal(buildTreeNode());
        System.out.println(list);
    }
}
