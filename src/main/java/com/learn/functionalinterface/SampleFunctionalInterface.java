package com.learn.functionalinterface;

import java.util.function.Function;

//Function interface is used for turning one parameter into a value of potentially different type and returning it.

public class SampleFunctionalInterface {
    public static void main(String[] args) {
        Function<String,Integer> f1 = String::length;
        Function<String,Integer> f2 = x -> x.length();

        System.out.println(f1.apply("horse"));
        System.out.println(f2.apply("horse"));
    }
}
