package org.nocoder.leetcode.solution;

/**
 * 1108. IP 地址无效化
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 */
public class DefangingAnIpAddress {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
