package com.learn.coreAPIs;

//Important points to remember
//1. Math.min method takes float,long,double,and int as parameter and return float,long, double and int respectively.
//2. Math.floor method takes double and return double

public class ReviewQuestion10 {
    public static void main(String[] args) {
        int one = Math.min(5,3);
        long two = Math.round(5.5);
        double three = Math.floor(6.6);
        var doubles = new double[]{one,two,three};
    }
}
