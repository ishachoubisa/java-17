package com.learn.BeyondClasses;

//Compact constructor,if we have 20 fields we will need to declare assignments for everyone,introduce boiler code.Its
//solution is compact constructor.The Long constructor implicitly called at end of compact constructor.

public record Crane2(int numberEggs,String name) {
    //Compact Constructor
    public Crane2{//No parentheses or constructor argument
        if(numberEggs<0) throw new IllegalArgumentException();
        name = name.toUpperCase();//name refer to input parameter (not instance members)
    }
    //Long constructor implicitly invoke at end of compact constructor
}
