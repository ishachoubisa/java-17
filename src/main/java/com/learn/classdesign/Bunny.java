package com.learn.classdesign;

public class Bunny {
    public Bunny(){
        System.out.println("hop");
    }

    //public bunny(){}//DOES NOT COMPILE.It is not constructor doesn't match the class name it is invalid method without
                   // return type.


    public void Bunny(){}//it is not a constructor it is a method with same as class name.


    //public Bunny(var food){}//DOES NOT COMPILE.Like method parameters,constructor parameters can be any valid class,array
                              //or primitive type,including generics,but may not include var.
}
