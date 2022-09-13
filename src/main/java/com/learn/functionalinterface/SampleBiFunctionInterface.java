package com.learn.functionalinterface;

import java.util.function.BiFunction;

public class SampleBiFunctionInterface {
    public static void main(String[] args) {
        BiFunction<String,String,String> b1 = String::concat;
        BiFunction<String,String,String> b2 = (String,toAdd) -> String.concat(toAdd);

        System.out.println(b1.apply("baby","chick"));
        System.out.println(b2.apply("baby","chick"));
    }
}
