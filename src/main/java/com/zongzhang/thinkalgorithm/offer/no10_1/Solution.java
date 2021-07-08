package com.zongzhang.thinkalgorithm.offer.no10_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @since 1.0
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(2));
        System.out.println(new Solution().fib(5));

    }

    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (map.get(n) != null) {
            return map.get(n);
        }
        int cache = (fib(n - 1) + fib(n - 2)) % 1000000007;
        map.put(n, cache);
        return cache;
    }
}
