package com.learn.collections;

import java.util.ArrayDeque;
import java.util.Deque;

//LIFO,last in first out

public class DequeAsStack {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(10);
        System.out.println(deque);
        deque.push(4);
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
        deque.peek();
        System.out.println(deque);
    }
}
