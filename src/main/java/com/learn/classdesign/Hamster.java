package com.learn.classdesign;

public class Hamster {
    private String color;
    private int weight=5;

    public Hamster(int weight, String color) {//First constructor
        this.weight = weight;
        this.color = color;
        System.out.println(weight);
        System.out.println(color);
    }

    //Calling first constructor in second constructor
    public Hamster(int weight) {//Second constructor
        this(weight,"brown");//Now Java calls the constructor that takes two parameter,with weight and color
                                   //set as expected

        System.out.println(weight);
        System.out.println(color);
        this.weight=weight;
        //weight = this.weight;//it will not change the value of parameter.
        color = "blue";
        System.out.println(weight);
        System.out.println(color);

        //Hamster(weight,color){}//DOES NOT COMPILE.Constructor does not call by calling them like normal method.
        //Constructors can be called only by writing new before the name of the constructor.
        //What happen if we stick new before constructor name?

        //new Hamster(weight,"brown");//Compiles, but creates an extra object.
        //it creates two new objects one with default weight and color values, other with desire weight and color values.
        //One is discarded after it is created.

    }

    public static void main(String[] args) {
        new Hamster(4);
    }
}