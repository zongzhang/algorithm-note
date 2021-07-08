package com.zongzhang.thinkalgorithm.offer.no10_2;

import java.util.HashMap;
import java.util.Map;

/**
 * @since 1.0
 */
public class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public int numWays(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (n < 1) {
            return 1;
        }
        if (map.get(n) != null) {
            return map.get(n);
        }
        int cache = (numWays(n - 1) + numWays(n - 2)) % 1000000007;
        map.put(n, cache);
        return cache;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numWays(7));
    }
}
