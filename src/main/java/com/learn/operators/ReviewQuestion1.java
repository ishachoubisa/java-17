package com.learn.operators;

public class ReviewQuestion1 {
    boolean b = true;
    boolean c = !b ;
    boolean d = c == b;//compile
    //boolean d = c == !b//compile
    //boolean d = (boolean) b;//compile
    //boolean e = ~b;//does not compile,~ can not use with boolean

    public static void main(String[] args) {
        ReviewQuestion1 r = new ReviewQuestion1();
        System.out.println(r.c);
        System.out.println(r.d);
    }
}
