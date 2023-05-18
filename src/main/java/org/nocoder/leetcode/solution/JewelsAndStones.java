package org.nocoder.leetcode.solution;

/**
 * You're given strings J representing the types of stones that are jewels, and S
 * representing the stones you have.  Each character in S is a type of
 * stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 *
 * @author jason
 * @date 18/9/16.
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int res = 0;
        if (J == null || "".equals(J) || S == null || "".equals(S)) {
            return res;
        }

        String[] jArr = J.split("");
        String[] sArr = S.split("");

        for (int i = 0; i < jArr.length; i++) {
            for (int j = 0; j < sArr.length; j++) {
                if (jArr[i].equals(sArr[j])) {
                    ++res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("ABC", "ABCCDE"));
        System.out.println(numJewelsInStones("", ""));
        System.out.println(numJewelsInStones(null, null));
        System.out.println(numJewelsInStones("ABC", ""));
        System.out.println(numJewelsInStones("", "ABCCDE"));
        System.out.println(numJewelsInStones("abc", "rewqabc"));
    }
}
