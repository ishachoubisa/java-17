package com.learn.classdesign;

public class Seal extends Mammal{
    //if this no argument constructor is not there and no call to argument super constructor this class will not compile.
    //the compiler automatically insert in subclass the first statement is implicit call to no argument super() constructor
    //1. it will create no argument subclass constructor
    //2. first line is call to no argument super() constructor.
    public Seal(){
        super(5);
    }
}
