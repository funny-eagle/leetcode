package org.nocoder.leetcode.solution;


/**
 * 700. Search in a Binary Search Tree
 * <p>
 * Given the root node of a binary search tree (BST) and a value.
 * You need to find the node in the BST that the node's value equals the given value.
 * Return the subtree rooted with that node.
 * If such node doesn't exist, you should return NULL.
 * <p>
 * For example,
 * <p>
 * Given the tree:
 * 4
 * / \
 * 2   7
 * / \
 * 1   3
 * <p>
 * And the value to search: 2
 * You should return this subtree:
 * 2
 * / \
 * 1   3
 * In the example above, if we want to search the value 5,
 * <p>
 * since there is no node with value 5, we should return NULL.
 * <p>
 * Note that an empty tree is represented by NULL,
 * <p>
 * therefore you would see the expected output (serialized tree format) as [], not null.
 *
 * @author jason
 * @date 2019/3/31.
 */
public class SearchInBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        SearchInBinarySearchTree.searchBST(root, 2);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode current = root;
        while (current != null) {
            if (val < current.val) {
                current = current.left;
            } else if (val > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
}
