package com.learn.Methods;

public class RopeSwing2 {
    private static final String rightRope;
    private static final String leftRope;
    private static final String name= "name";
    //private static final String bench;
    static {
        rightRope = "right";
        leftRope ="left";
    }
    static {
        //rightRope="right";//DOES NOT COMPILE,can not reinitialize a final variable.
        //name = "name";//DOES NOT COMPILE
    }

    public static void main(String[] args) {
        //bench = "bench";
    }
}
