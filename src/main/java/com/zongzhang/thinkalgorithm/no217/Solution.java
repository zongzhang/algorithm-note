package com.zongzhang.thinkalgorithm.no217;

import java.util.HashMap;
import java.util.Map;

/**
 * @since 1.0
 */
public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                return true;
            }
        }
        return false;
    }

}
