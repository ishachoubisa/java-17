package com.learn.operators;

public class ReviewQuestion1 {
    boolean b = true;
    boolean c = !b;//this is correct.
    //c=!b;//Does not compile.you have to initialize variable c with other variable !b on the same line where you
          //declare c.
    boolean d = c == b;//compile
    //boolean d = c == !b//compile
    //boolean d = (boolean) b;//compile
    //boolean e = ~b;//does not compile,~ can not use with boolean

    public static void main(String[] args) {

//        boolean x = true;
//        boolean y;
//        y = !x;//compile you can do this over here in a method.
        ReviewQuestion1 r = new ReviewQuestion1();
        System.out.println(r.c);
        System.out.println(r.d);
    }
}
