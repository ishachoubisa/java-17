package com.learn.makingdecisions;

public class Seasons {
    public void printSeason(int month){
        switch (month){
            case 1,2,3 -> System.out.println("winter");//we can take multiple values of case,separated by commas
            case 4,5,6 -> System.out.println("spring");
            case 7,8,9 -> System.out.println("summer");
            case 10,11,12 -> System.out.println("fall");
        }
    }

    public static void main(String[] args) {
        Seasons s = new Seasons();
        s.printSeason(6);
    }
}
