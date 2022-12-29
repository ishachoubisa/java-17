package com.learn.BeyondClasses;

//Static nested class can be instantiated without an instance of enclosing class.
//it can't access instance variables or methods declared in outer class.
// It is like a top-level class except, it can be marked private or protected.
//enclosing class can refer to fields and methods of static nested class.

public class Park {
     static class Ride{
         private int price=20;
     }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
    }
}
