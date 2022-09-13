package com.learn.functionalinterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

//Biconsumer takes two parameter same type or different type.

public class SampleBiConsumerInterface {
    public static void main(String[] args) {
        var map = new HashMap<String,Integer>();
        BiConsumer<String,Integer> b1 = map::put;
        BiConsumer<String,Integer> b2 = (k,v) -> map.put(k,v);

        b1.accept("Chicken",7);
        b2.accept("chick",2);

        System.out.println(map);
    }
}
