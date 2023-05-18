package org.nocoder.leetcode.solution;

/**
 * 832. Flipping an Image
 * Given a binary matrix A, we want to flip the image horizontally,
 * then invert it, and return the resulting image.
 * <p>
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * <p>
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 * <p>
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 *
 * @author yangjinlong
 */
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flipAndInvertImage(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.print(", ");
        }
        ;
    }

    public static int[][] flipAndInvertImage(int[][] arr) {
        if (arr == null || arr.length < 1 || arr[0].length > 20) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < arr.length; i++) {
            int[] reverseArray = reverseArray(arr[i]);
            for (int j = 0; j < reverseArray.length; j++) {
                if (reverseArray[j] == 0) {
                    reverseArray[j] = 1;
                } else {
                    reverseArray[j] = 0;
                }
                arr[i] = reverseArray;
            }
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length < 1) {
            return arr;
        }
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        return result;
    }
}
