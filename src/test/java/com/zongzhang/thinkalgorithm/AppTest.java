package com.zongzhang.thinkalgorithm;

import java.util.HashMap;

/**
 * @author zongzhang
 * @since 1.0
 * <p>
 * create on 2018/9/5
 */
public class AppTest {
    public static void main(String[] args) {
        HashMap a = new HashMap();
        a.put("1", "2");
        a.put("1", "3");

        System.out.println(a.get("1"));
        System.out.println(1<<5);
    }
}
