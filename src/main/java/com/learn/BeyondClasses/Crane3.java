package com.learn.BeyondClasses;

public record Crane3(int numberEggs,String name) {
    //Compact Constructor
    public Crane3{
        if(name == null || name.length()<1) throw new IllegalArgumentException();
        name = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
    }//the compact constructor can modify the constructor parameter,they can not modify fields of record.

    //this does not compile
//    public Crane3{
//       this.numberEggs = 10;//Does not compile.This is record field.
//        numberEggs =10;//Does compile.This is constructor parameter can be modified.
//    }
}
