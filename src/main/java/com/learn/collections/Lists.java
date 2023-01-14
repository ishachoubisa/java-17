package com.learn.collections;

import java.util.List;
import java.util.Arrays;

public class Lists {
    public static void main(String[] args) {
        String[] array = new String[]{"a","b","c"};
        List<String> asList = Arrays.asList(array);//Returns fixed size list backed by an array
        List<String> of = List.of(array);//Returns an immutable list
        List<String> copy = List.copyOf(asList);//Returns an immutable list with copy of original collections values

        array[0] = "z";//we replace value of main array it will reflect in asList but not other two.

        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        asList.set(0,"x");//we can replace value of asList but not other two.

        System.out.println(Arrays.toString(array));

        copy.add("y");//we can not add or delete any value from these three.
    }
}
