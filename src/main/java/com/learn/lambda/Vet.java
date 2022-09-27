package com.learn.lambda;

public class Vet {
    public static String takeNap(Yawn y){
        return y.yawn(10,null);
    }

    public static void main(String[] args) {
        System.out.println(takeNap((a,b) -> "Sleep:" + (double)(b==null ? a : a)));
    }
}
