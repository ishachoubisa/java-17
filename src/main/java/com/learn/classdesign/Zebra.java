package com.learn.classdesign;

public class Zebra extends AnimalZebra {
    public Zebra(int age){
        super(age);//Refers to constructor in Animal2.It can only be called once as the first statement of constructor
    }
    public Zebra(){
        this(4);//Refers to constructor in Zebra with int argument
    }
}
