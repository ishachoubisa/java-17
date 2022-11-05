package com.learn.makingdecisions;

public class ReviewQuestion12 {
    public static void main(String[] args) {
        int sing = 8,squawk = 2,notes =0;
        while(sing > squawk){
            sing--;
            System.out.println(sing);
            squawk+=2;
            System.out.println(squawk);
            notes += sing + squawk;
            System.out.println(notes);
        }
        System.out.println(notes);
    }
}
