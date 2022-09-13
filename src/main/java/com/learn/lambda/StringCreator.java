package com.learn.lambda;

public class StringCreator {
    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;
        //EmptyStringCreator lambda = () -> new String();
        var myString = methodRef.create();
        System.out.println(myString.equals("snake"));
    }
}
