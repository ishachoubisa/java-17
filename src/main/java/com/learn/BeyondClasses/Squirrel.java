package com.learn.BeyondClasses;

public class Squirrel {
    public void visitFox(){
            //new Den();//Does not compile because not a instance method inside Fox class,adding a Fox reference would not fix
            //the problem entirely,though.Den is private and not accessible in Squirrel class.
        }
}

