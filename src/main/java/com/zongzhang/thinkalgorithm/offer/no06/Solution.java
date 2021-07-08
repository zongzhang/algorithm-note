package com.zongzhang.thinkalgorithm.offer.no06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @since 1.0
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(3);
        head.next=head2;

        System.out.println(Arrays.toString(new Solution().reversePrint(head)));

    }

    public int[] reversePrint(ListNode head) {
       List<Integer> a = new ArrayList<>();
       ListNode tmp = head;
        while (tmp != null) {
            a.add(tmp.val);
            tmp= tmp.next;
        }

        int[] r = new int[a.size()];
        int n =1;
        for (Integer integer : a) {
            r[a.size()-n] = integer;
            n++;
        }
        return r;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
