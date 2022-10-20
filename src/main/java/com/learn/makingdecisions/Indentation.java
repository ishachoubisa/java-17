package com.learn.makingdecisions;

public class Indentation {
    public static void main(String[] args) {
        int hourOfDay =2;
        int morninggreetingcount = 0;
        if(hourOfDay<11)//there is no braces
            System.out.println("good morning");//it will execute only when condition is met.
        morninggreetingcount++;//but this will execute always even if condition is not met.
        System.out.println(morninggreetingcount);
    }
}
