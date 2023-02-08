package com.learn.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalWithPrim {
    public static void main(String[] args) {
        var stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
        System.out.println(optional);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(()->Double.NaN));


        LongStream longs = LongStream.of(5,10);
        long sum = longs.sum();
        System.out.println(sum);
        DoubleStream optional2 = DoubleStream.generate(()->Math.PI);
        OptionalDouble min = optional2.min();
        System.out.println(min);


    }
}
