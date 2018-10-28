package org.nocoder.leetcode.solution;

import java.util.Set;

/**
 * Given a string s and a dictionary of words dict, determine if s can be
 * segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * For example, given
 * s ="leetcode",
 * dict =["leet", "code"].
 * <p>
 * Return true because"leetcode"can be segmented as"leet code".
 *
 * @author jason
 * @date 2018/10/22.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        int len = s.length();
        boolean[] arrays = new boolean[len + 1];
        arrays[0] = true;
        for (int i = 1; i <= len; ++i) {
            for (int j = 0; j < i; ++j) {
                if (arrays[j] && dict.contains(s.substring(j, i))) {
                    arrays[i] = true;
                    break;
                }
            }
        }
        return arrays[len];
    }
}
