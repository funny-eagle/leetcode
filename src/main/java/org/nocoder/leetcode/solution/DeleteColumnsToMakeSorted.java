package org.nocoder.leetcode.solution;

/**
 * 944. Delete Columns to Make Sorted
 * <p>
 * We are given an array A of N lowercase letter strings, all of the same length.
 * <p>
 * Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.  The remaining rows of strings form columns when read north to south.
 * <p>
 * For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef","vyz"], and the remaining columns of A are ["b","v"], ["e","y"], and ["f","z"].  (Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]].)
 * <p>
 * Suppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in non-decreasing sorted order.
 * <p>
 * Return the minimum possible value of D.length.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["cba","daf","ghi"]
 * Output: 1
 * Explanation:
 * After choosing D = {1}, each column ["c","d","g"] and ["a","f","i"] are in non-decreasing sorted order.
 * If we chose D = {}, then a column ["b","a","h"] would not be in non-decreasing sorted order.
 * Example 2:
 * <p>
 * Input: ["a","b"]
 * Output: 0
 * Explanation: D = {}
 * Example 3:
 * <p>
 * Input: ["zyx","wvu","tsr"]
 * Output: 3
 * Explanation: D = {0, 1, 2}
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 1000
 *
 * @author jason
 * @date 2018/11/24.
 */
public class DeleteColumnsToMakeSorted {

    public static int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j - 1].charAt(i) > A[j].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] a1 = new String[]{"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(a1));

        String[] a2 = new String[]{"a", "b"};
        System.out.println(minDeletionSize(a2));

        String[] a3 = new String[]{"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(a3));
    }
}
