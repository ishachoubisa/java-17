package com.learn.BuildingBlocks;

//For most classes,you don't have to code a constructor - the compiler will supply a "do nothing" default
// constructor for you.

public class Chicken {
    //Chicken c = new Chicken();//First you declare the type that you will be creating(Chicken) and give the variable
                                // a name (c).This gives java a place to store a reference to the object.Then you write
                                // new Chicken() to actually create the object.
                                //Chicken() looks like a method since it followed by parentheses. It's called a constructor
                                //which is special type of method that creates a new object.

    int numEggs = 12;//initialize on line

    //public void Chicken(){}//It's a regular method.It's not a constructor since it has a return type
    String name;
    public Chicken(){//It is a constructor with same name as class name and no return type.The purpose of constructor is
                     // to initialize fields,although you can put any code in there.
        System.out.println("in constructor");
        name = "Duke";//initialize in constructor
    }
}
