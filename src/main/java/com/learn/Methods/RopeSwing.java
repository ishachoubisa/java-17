package com.learn.Methods;

import com.learn.rope.*;
import com.learn.rope.Rope2.*;

//There are two details to notice in this code.First,note that RopeSwing has an instance initializer and not a static
// initializer. Since RopeSwing is never constructed,teh instance initializer does not run. The other detail is that length
// is static.

public class RopeSwing {
    private static Rope2 rope1 = new Rope2();
    private static Rope2 rope2 = new Rope2();
    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
    //private static RopeSwing rs = new RopeSwing();//If this line is here then instance initializer will invoke because
                                                    // it is calling or constructing default constructor.
                                                    // Also note private and static specifier is not allowed here.
        rope1.length=2;
        rope2.length=8;
        System.out.println(rope1.length);
    }
}
