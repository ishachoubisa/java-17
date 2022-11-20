package com.learn.Methods;

public class Squares {
    public static long square(int x){
        var y = x*(long)x;//This wiil compile making y long
        x=-1;
        return y;
    }

    public static void main(String[] args) {
        var value = 9;
        var result=square(value);
        System.out.println(value);//If we print result then te answer is 81,right now answer is 8
    }
}
