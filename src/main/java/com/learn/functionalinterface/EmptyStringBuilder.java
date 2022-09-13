package com.learn.functionalinterface;

import java.util.function.Supplier;

//Inbuild functional interface Supplier is used when constructing new object(method reference by calling constructor)
//Supplier is used to generate or supply value without taking any input.

public class EmptyStringBuilder {
    public static void main(String[] args) {
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();

        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
