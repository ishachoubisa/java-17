package com.learn.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateMethods {
    public static void main(String[] args) {
        //Filtering
        Stream<String> s = Stream.of("monkey","gorilla","bonobo");
        s.filter(x->x.startsWith("m")).forEach(System.out::println);

        //Removing duplicates
        Stream<String> s1 = Stream.of("duck","duck","duck","goose");
        s1.distinct().forEach(System.out::println);

        //Limiting
        Stream<Integer> s2 = Stream.iterate(1,n->n+1);
        s2.skip(5).limit(2).forEach(System.out::println);

        //Mapping,converting String objects to Integer objects
        Stream<String> s3 = Stream.of("monkey","gorilla","bonobo");
        s3.map(String::length).forEach(System.out::println);

        //FlatMap,this gets all animals into same level(top level) and removes empty list
        List<String> zero = List.of("");
        var one = List.of("monkey");
        var two = List.of("mummy gorilla","baby gorilla");
        Stream<List<String>> animals = Stream.of(zero,one,two);
        animals.flatMap(m->m.stream()).forEach(System.out::println);

        //Concatenating Streams
        var three = Stream.of("monkey");
        var four = Stream.of("mummy gorilla","baby gorilla");
        Stream.concat(three,four).forEach(System.out::println);//thus produce same three lines as the previous example

        //Sorting,it does natural sorting
        Stream<String> s4 = Stream.of("brown ","bear");
        s4.sorted().forEach(System.out::println);

        Stream<String> s5 = Stream.of("brown bear","grizzly");
        s5.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Stream<String> s6 = Stream.of("brown bear","grizzly");
        //s6.sorted(Comparator::reverseOrder).forEach(System.out::println);//DOES NOT COMPILE,BECAUSE reverseOrder() takes no
        //argument amd returns a value,the method reference is equivalent to ()-> Comparator.reverseOrder(),which is
        //really a Supplier<Comparator>.This is not compatible with sorted().

        //Taking a Peek
        var stream = Stream.of("black bear","brown bear","grizzly");
        long count = stream.filter(s7->s7.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);

        //changing the state with peek()
        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');

        Stream<List<?>> stream2 = Stream.of(numbers,letters);
        stream2.map(List::size).forEach(System.out::println);


        Stream<List<?>> bad = Stream.of(numbers,letters);
        bad.peek(x->x.remove(0)).map(List::size).forEach(System.out::println);//this example is bad.
    }
}
