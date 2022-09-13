package com.learn.functionalinterface;

import java.time.LocalDate;
import java.util.function.Supplier;

//Supplier is used to generate a value without taking any input.
//method reference by calling static method.

public class GetLocalDate{
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);
    }
}

