package com.learn.Methods;

public class CallMethWithVarargs {
    static public void walk1(int... steps){
        int[] step2 = steps;
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3};
        walk1(data);
        walk1(1,2,3);
        walk1();
    }
}
