package com.learn.classdesign;

public class Gorilla extends AnimalGorilla{
    public Gorilla(int age){
        super(age,"Gorilla");//call the first AnimalGorilla constructor
    }
    public Gorilla(){
        super(5);//call the second AnimalGorilla constructor
    }
}
