package com.learn.functionalinterface;

import java.util.function.Predicate;

//Predicate is often used when filtering or matching.

public class SamplePredicateInterface {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));
    }
}