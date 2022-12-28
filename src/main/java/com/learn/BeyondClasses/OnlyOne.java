package com.learn.BeyondClasses;

//the first time we ask for any of the enum values,Java constructs all of the enum values.After that,Java just returns the
//already constructed enum values.

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b){//this calls the constructor only once.
        System.out.println("Constructing ");
    }
}
