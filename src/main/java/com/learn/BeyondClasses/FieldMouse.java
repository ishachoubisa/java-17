package com.learn.BeyondClasses;

public class FieldMouse implements Climb, CanBurrow{//FieldMouse implements two interfaces with (,)comma in between.
                                                    //A class can implements multiple interfaces each separated by comma
    public Float getSpeed(int age){//If any interface define abstract methods then concrete class is required to override
                                   //them.Here return type is covariant Float can be implicitly cast to Number.
        return 11f;//The class override two abstract methods at the same time with one method declaration.(duplicate interface methods)
    }
}
