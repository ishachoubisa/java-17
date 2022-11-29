package com.learn.classdesign;

public class GiraffeFamilyOkapi {
    static {
        System.out.println("A");
    }
    {
        System.out.println("B");
    }
    public GiraffeFamilyOkapi(String name){
        this(1);
        System.out.println("C");
    }
    public GiraffeFamilyOkapi(){
        System.out.println("D");
    }
    public GiraffeFamilyOkapi(int stripes){
        System.out.println("E");
    }
}
