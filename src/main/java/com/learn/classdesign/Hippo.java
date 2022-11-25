package com.learn.classdesign;

//Initializing classes
//Initialize Class Hippo
//1. if there is superclass AnimalHippo of Hippo,then initialize class AnimalHippo first.
//2.process all static variable in order
//3.process all static initializer in order

public class Hippo extends AnimalHippo{
    public static void main(String[] args) {
        System.out.println("C");//the program print ABC because main() method is inside Hippo class(subclass), the class will
                                // be initialize first,starting with superclass and printing AB.Afterward, the main method
                                // is executed,printing C
        new Hippo();//Even though the main() method creates three instances,the class is loaded only once.
        new Hippo();
        new Hippo();
    }
    static {
        System.out.println("B");
    }
}
