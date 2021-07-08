package com.zongzhang.thinkalgorithm.offer.no09;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 * @since 1.0
 */
public class CQueue {
    int size = 0;

    private final Deque<Integer> in;
    private final Deque<Integer> out;

    public CQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        in.push(value);
        size++;
    }

    public int deleteHead() {
        if (size == 0) {
            return -1;
        }
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        size--;
        return out.pop();
    }
}
