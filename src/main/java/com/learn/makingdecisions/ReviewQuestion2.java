package com.learn.makingdecisions;

public class ReviewQuestion2 {
    public static void main(String[] args) {
        int temperature = 4;
    long humidity = -temperature +temperature*3;
    if(temperature >=4)
        if(humidity <6)System.out.println("Too Low");
        else System.out.println("Just Right");//this else is optional if do not put it then also the code will run
        else System.out.println("Too High");//this else also optional
    }
}
