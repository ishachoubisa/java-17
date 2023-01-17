package com.learn.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueMethods {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);
        deque.peekFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.peekLast();
        System.out.println(deque);
    }
}
