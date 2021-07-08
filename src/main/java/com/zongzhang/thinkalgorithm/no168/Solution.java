package com.zongzhang.thinkalgorithm.no168;

/**
 * @since 1.0
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(28));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

}
