package com.learn.BeyondClasses;

//Using enum in switch statement

public class Enum2 {
    public static void main(String[] args) {
        Season summer = Season.Summer;
    switch(summer){
        case Winter:
            System.out.println();
            break;
        case Summer:
            System.out.println("Time for the pool");
            break;
        default:
            System.out.println("Is it summer yet");
    }
//    var message = switch(summer){
//        case Season.Winter -> "Get out the sled";
//        case 0 -> "Time for the pool";
//        default -> "Is it summer yet?";
//    };
//        System.out.println(message);
  }
}