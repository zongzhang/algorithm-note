package com.zongzhang.thinkalgorithm.offer.no05;

/**
 * @since 1.0
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().replaceSpace("We are happy."));
    }
    public String replaceSpace(String s) {
        //投机取巧
        return s.replace(" ", "%20");
    }
}
