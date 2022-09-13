package com.learn.functionalinterface;

import java.util.function.Consumer;

//Consumer is used when you want to do something on parameter but not return anything.
//Printing is the common use of consumer interface.

public class SampleConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");
    }
}
