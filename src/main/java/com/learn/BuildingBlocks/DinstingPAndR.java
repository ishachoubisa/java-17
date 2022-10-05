package com.learn.BuildingBlocks;



public class DinstingPAndR {
    String reference = "hello";
    int len = reference.length();//can call method on reference type
    //int bad = len.length();//Does not compile,can not call method on primitive type

   // int number = null; //Does not compile,can not assign null to primitive,if you don't know the value of int
                         // if you want to assign it to null,you should use a numeric wrapper class,
                         // such as Integer,instead of int
    String string = null;
}
