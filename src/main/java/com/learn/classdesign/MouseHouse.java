package com.learn.classdesign;

public class MouseHouse {
    private final int volume;
    private final String name="the Mouse House";;
//  1. First way initialize final instance variable in instance initializer
    {
        volume =10;
    }
//    2. Second way initialize the final instance variable in constructor
//    public MouseHouse(){
//        this.name ="Empty House";//Constructor assignment
//    }
//    3.Third way in terms of assigning value,each constructor is reviewed individually,which is why the second constructor
//    does not compile.
//    public MouseHouse(String name){
//        this.name = name;
//    }
//    public MouseHouse(){//DOES NOT COMPILE.the compiler detects that a value is never set for name and reports an error on the
                           //where the constructor is declared.
//        this.volume = 2;//DOES NOT COMPILE.the constructor set value for volume variable,it was already assigned a value by
//                         the instance initializer.

//    }
}
