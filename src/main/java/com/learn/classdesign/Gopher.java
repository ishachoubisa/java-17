package com.learn.classdesign;

public class Gopher {
    //First case:Construct calling itself infinitely.
    //   public Gopher(int dugHoles){
    //   this(5);//DOES NOT COMPILE.The constructor is calling itself infinitely,referred to as cycle and is similar to the
                  //infinite loops.Since the code can never terminate,compiler stops and reports this as an error.

    //    this();//DOES NOT COMPILE
    //    }


    //Second case: there are two constructors calling one another,the process continues infinitely.
    //   public Gopher(){
    //    this(5)
     //    }
}
