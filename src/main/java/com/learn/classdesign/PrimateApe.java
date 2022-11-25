package com.learn.classdesign;

//note
//1.if there is only one parameterised constructor in parent class and also in subclass, subclass para consc calling parent class
// para constructor super() then there is no need of no-argument constructor in parent class.
//2.if there is only one para const in parent class and there is two constructors one para and other no-argument
// constructor in subclass and if para cons of subclass is calling para cons of parent class with super() then it will
// not generate error but if there is no call to super class constructor in no-argu const of subclass then it will generate
// error saying there is no no-arg cons in parent class.


public class PrimateApe {
    public PrimateApe(int age){//implicitly calling super() cons of java.lang.Object
        System.out.println("Primate");
    }
    public PrimateApe(){
    }
}
