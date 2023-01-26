package com.learn.streams;

import java.util.List;
import java.util.stream.Stream;

//Creating a finite Stream

public class SourceStream {
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleElement = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1,2,3);

    //Converting list to stream
    List<String> list = List.of("a","b","c");
    Stream<String> fromList = list.stream();

    //Parallel Stream
    Stream<String> fromListParallel = list.parallelStream();
}
