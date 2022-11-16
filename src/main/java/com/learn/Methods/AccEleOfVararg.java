package com.learn.Methods;

public class AccEleOfVararg {
    public static void run(int... steps){
        System.out.println(steps[1]);
    }
    public static void main(String[] args){
        run(11,77);
    }
}
