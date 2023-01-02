package com.learn.BeyondClasses;

//Polymorphism,the property of an object to take on many different forms.
//reference with same type as object.
//reference that is superclass of object.
//reference that defines an interface the object implements or inherits.

public class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }

    public int age =10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        Primate primate = lemur;
        System.out.println(lemur.hasHair());

        HasTail hasTail = lemur;
        System.out.println(lemur.isTailStriped());
    }
}
