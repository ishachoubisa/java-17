package com.learn.operators;

public class ReviewQuestion4 {
    public static void main(String[] args) {
        boolean canine = true,wolf = true;
        int teeth = 20;
        canine = (teeth != 10)^(wolf = false);
        System.out.println(canine+","+teeth+","+wolf);
    }
}
