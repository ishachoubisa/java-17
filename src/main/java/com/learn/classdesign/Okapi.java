package com.learn.classdesign;

//Order of Initialization
//1. First both classes are initialized,static var then static initializer in order they are declare of parent class then
//   child class.A class is initialized at most once by JVM before it is referenced or used.It means static var and initializer
//     are called only once irrespective of no of objects are created.
//2. instance var and then instance initializer in order they are declare of only parent class
//3. constructor of super class is called
//4. Instant initializer of subclass.
//5. Constructor of subclass.

public class Okapi extends GiraffeFamilyOkapi{
    static {
        System.out.println("F");
    }
    public Okapi(int stripes){
        super("sugar");
        System.out.println("G");
    }
    {
        System.out.println("H");
    }

    public static void main(String[] args) {
        new Okapi(1);//it will print AFBECHG
        System.out.println();
        new Okapi(2);//it will print BECHG
    }
}
