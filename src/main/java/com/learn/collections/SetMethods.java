package com.learn.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {
    public static void main(String[] args) {
        //Creating Immutable Set and copy of existing one.
        Set<Character> letters = Set.of('a','b','c');
        Set<Character> copy = Set.copyOf(letters);

        //Methods of Set HashSet()
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);//true
        boolean b2 = set.add(10);//true
        boolean b3 = set.add(66);//false,set is unique so produce false if we add duplicate.
        boolean b4 = set.add(8);//true
        set.forEach(System.out::println);//HashSet() print values in arbitrary order

        //TreeSet()
        Set<Iteration> set1 = new TreeSet<>();
        boolean b11 = set.add(66);
        boolean b12 = set.add(10);
        boolean b13 = set.add(66);
        boolean b14 = set.add(8);
        set.forEach(System.out::println);//TreeSet() print values in natural sorted order.Numbers implement Comparable interface
                                         //in Java,which is used for sorting.
    }
}
