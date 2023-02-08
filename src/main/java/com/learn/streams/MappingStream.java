package com.learn.streams;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MappingStream {
    private static int stream;

    public static void main(String[] args) {
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());

        //Using FlatMap()
        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x-> IntStream.of(x));
        DoubleStream doubles = integerList.stream()
            .flatMapToDouble(x-> DoubleStream.of(x));
        LongStream longs = integerList.stream()
                .flatMapToLong(x->LongStream.of(x));

//        private static Stream<Integer> mapping(IntStream stream){
//            return; stream.mapToObj(x->x);
//        }
//
//        private static Stream<Integer> boxing(IntStream stream){
//            return; stream.boxed();
//        }

    }
}
