package com.learn.BeyondClasses;

public enum Season2 {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    //the enum values must end with a semicolon(;) if there is anything in enum besides the values and optional if only enum
    // values are there.
    private final String expectedVisitors;//we marked it private and final so that our enum properties can not be modified
                                          //it is possible to create an enum with instance var that can be modified but it is
                                          //poor practice.When designing an enum, the values should be immutable.
    private Season2(String expectedVisitors){//All enum constructor are implicitly private.you can not extend an enum and the
                                             //constructor can be called only within the enum itself. it will not compile if
                                             // it marked public or protected.
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
