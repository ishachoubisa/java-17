package com.learn.BeyondClasses;

//The Long Constructor,the compiler will not insert a constructor if you already define one.Since each field is final,the
//constructor must set every field.

public record Crane(int numberEggs, String name) {
    //Long Constructor
    public Crane(int numberEggs,String name){
        if(numberEggs<0) throw new IllegalArgumentException();
        this.numberEggs=numberEggs;
        this.name = name;
    }
   // public Crane(int numberEggs,String name){}//Does not compile
}
