package com.learn.operators;

public class ReviewQuestion1 {
    boolean b = true;
    boolean c = !b ;
    boolean d = (boolean) b;

    public static void main(String[] args) {
        ReviewQuestion1 r = new ReviewQuestion1();
        System.out.println(r.c);
    }
}
