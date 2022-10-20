package com.learn.makingdecisions;

public class Subtype {
    public static void main(String[] args) {


        Integer value = 123;
        if (value instanceof Integer) {}
        //if(value instanceof Integer data){}//DOES NOT COMPILE,the type of pattern variable must be subtype of variable on left
                                             //side of expression.
    }
}