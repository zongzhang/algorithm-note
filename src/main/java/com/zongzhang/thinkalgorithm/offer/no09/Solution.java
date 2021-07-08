package com.zongzhang.thinkalgorithm.offer.no09;

/**
 * @since 1.0
 */
public class Solution {


    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(1);
        obj.appendTail(2);
        int d = obj.deleteHead();
        System.out.println(d);
    }


}




