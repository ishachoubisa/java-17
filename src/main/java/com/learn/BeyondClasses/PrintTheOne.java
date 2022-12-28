package com.learn.BeyondClasses;

public class PrintTheOne {
    public static void main(String[] args) {
        System.out.println("Begin");
        OnlyOne firstCall = OnlyOne.ONCE;//Prints constructing
        OnlyOne secondCall = OnlyOne.ONCE;//Doesn't print anything
        System.out.println("end");

        //enum Season2
        Season2.SUMMER.printExpectedVisitors();//Enum Season2 method call
    }
}
