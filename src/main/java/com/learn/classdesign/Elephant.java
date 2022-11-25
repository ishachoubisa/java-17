package com.learn.classdesign;

public class Elephant extends Mammal{
    //public Elephant(){}//Does not compile it will implicitly call to no argument super() constructor but there is no no-argument
                       //super() constructer in parent class there is argument constructor in parent class.
    public Elephant(){
        super(9);//this is correct now it will compile.Subclass may include no-argument constructor even if their
                     // parent classes do not.
    }
}
