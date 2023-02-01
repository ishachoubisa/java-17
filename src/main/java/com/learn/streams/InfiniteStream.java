package com.learn.streams;

import java.util.stream.Stream;

public class InfiniteStream {
    Stream<Double> randomNumber = Stream.generate(Math::random);
    Stream<Integer> oddNumber = Stream.iterate(1,n->n+2);

    //Finite stream
    Stream<Integer> oddNumberUnder100 = Stream.iterate(1,//seed
                                                       n->n<100,//Predicate to specify when done
                                                       n->n+2);//UnaryOperator to get next value

    public static void main(String[] args) {
        InfiniteStream infSt = new InfiniteStream();
        System.out.println(infSt.randomNumber);
        System.out.println(infSt.oddNumber);
        System.out.println(infSt.oddNumberUnder100);
    }
}
