package com.learn.streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0,(s,n)->s+n));

        Stream<Integer> stream1 =Stream.of(1,2,3);
        System.out.println(stream1.mapToInt(x->x).sum());

        IntStream intStream = IntStream.of(1,2,3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        DoubleStream empty = DoubleStream.empty();
        System.out.println(empty);

        DoubleStream one = DoubleStream.of(3.14);
        one.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.2,2.1,3.1);
        varargs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fraction = DoubleStream.iterate(0.5, n->n/2);
        random.limit(3).forEach(System.out::println);
        fraction.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1,n->n+1).limit(5);
        count.forEach(System.out::println);

        IntStream range = IntStream.range(1,6);
        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1,5);
        rangeClosed.forEach(System.out::println);


    }
}
