package org.nocoder.leetcode.solution;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * 937. Reorder Log Files
 *
 * You have an array of logs.  Each log is a space delimited string of words.
 *
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 *
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.
 * It is guaranteed that each log has at least one word after its identifier.
 *
 * Reorder the logs so that all of the letter-logs come before any digit-log.
 *
 * The letter-logs are ordered lexicographically ignoring identifier,
 *
 * with the identifier used in case of ties.  The digit-logs should be put in their original order.
 *
 * Return the final order of the logs.
 *
 *
 * Example 1:
 *
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *
 *
 * Note:
 *
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] is guaranteed to have an identifier, and a word after the identifier.
 *
 * @author jason
 * @date 2018/11/11.
 */
public class ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {
        ArrayList<String> list = new ArrayList<>();
        TreeMap<String, String> map = new TreeMap<>();

        for (String str: logs) {
            String[] tokens = str.split(" ");
            if (!Character.isAlphabetic(tokens[1].charAt(0))) {
                list.add(str);
            } else {
                String key = str.substring(tokens[0].length()).trim();
                map.put(key, str);
            }
        }

        String[] result = new String[logs.length];
        int i = 0;
        for (String key: map.keySet()) {
            result[i++] = map.get(key);
        }

        for (String str: list){
            result[i++] = str;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] logs = new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        reorderLogFiles(logs);
    }
}
