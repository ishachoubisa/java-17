package com.learn.streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalMethods {
    //Counting
    Stream<String> s = Stream.of("monkey","ape","bonobo");

    public static void main(String[] args) {
        TerminalMethods ter = new TerminalMethods();
        System.out.println(ter.s.count());

        //Min value
        Stream<String> s = Stream.of("monkey","ape","bonobo");
        Optional<String> min = s.min((s1,s2)->s1.length()-s2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1,s2)->0);
        System.out.println(minEmpty.isPresent());

        //Finding value
         Stream<String> s1 = Stream.of("monkey","ape","bonobo");
         Stream<String> infinite = Stream.generate(()->"chimp");

         s1.findAny().ifPresent(System.out::println);
         infinite.findAny().ifPresent(System.out::println);

         //Matching value
        var list = List.of("monkey","2","chimp");
        Stream<String> infinite1 = Stream.generate(()->"chimp");
        Predicate<String> pred = x->Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(infinite1.anyMatch(pred));

        //Iterating


        //Reducing
        var array = new String[]{"w","o","l","f"};
        String result = "";
        for(var st:array ) result = result+st;
        System.out.println(result);

        //Using lambda
        Stream<String> stream = Stream.of("w","o","l","f");
        String word = stream.reduce("",(st,c)->st+c);
        System.out.println(word);

        //Using method reference
        Stream<String> stream1 = Stream.of("w","o","l","f");
        String word1 = stream1.reduce("",String::concat);
        System.out.println(word1);

        Stream<Integer> stream2 = Stream.of(3,5,6);
        System.out.println(stream2.reduce(1,(a,b)->a*b));

        BinaryOperator<Integer> op = (a,b)->a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3,5,6);

        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElements.reduce(op).ifPresent(System.out::println);

        //Collecting
        Stream<String> stream3 = Stream.of("w","o","l","f");
        StringBuilder word2 = stream3.collect(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word2);

        Stream<String> stream4 = Stream.of("w","o","l","f");
        TreeSet<String> set = stream4.collect(TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(set);

        Stream<String> stream5 = Stream.of("w","o","l","f");
        TreeSet<String> set1 = stream5.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1);

        Stream<String> stream6 = Stream.of("w","o","l","f");
        Set set2 = stream6.collect(Collectors.toSet());
        System.out.println(set2);
    }
}
