package com.learn.BeyondClasses;

//Overloaded constructor more closely related to long constructor,dont use any of syntactical features of compact constructors.
//The first line of overloaded constructor must be explicit call to another constructor via this().If there are no other
//constructor ,the long constructor must be called.

public record Crane4(int numberEggs,String name) {
    public Crane4(String firstName,String lastName){
        this(0,firstName + " " + lastName );
    }

    //Unlike compact constructor,you can only transform data on first line.After first line, all of fields will already be
    // assigned and object is immutable.
    public Crane4(int numberEggs,String firstName,String lastName){
        this(numberEggs+1,firstName + ""+ lastName);
        numberEggs = 10;//No effect(applies to parameter,not instance field)
        //this.numberEggs = 20;//Does not compile
    }

    //Same as chapter 6 you can not declare two record constructor to call each other infinitely or as a cycle
//    public Crane4(String name){
//        this(2);//Does not compile
//    }
//    public Crane4(int numberEggs){
//        this("");//Does not compile
//    }
}
