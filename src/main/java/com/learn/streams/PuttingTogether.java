package com.learn.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingTogether {
    public static void main(String[] args) {
        var list = List.of("Arow","Aran","Joey","Arman","Bing");
        list.stream().
                filter(x->x.length()==4).
                sorted().
                limit(2).
                forEach(System.out::println);

        Stream.generate(()->"Elsa")//Infinite stream
                .filter(n->n.length()==4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        Stream.generate(()->"Elsa")//finite stream
                .filter(n->n.length()==4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        Stream.generate(()->"Olaf Lazisson")//infinite stream
                .filter(n->n.length()==4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        long count =Stream.of("goldfish","finch")
                .filter(s->s.length()>5)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println(count);
    }
}
