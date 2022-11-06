package com.learn.makingdecisions;

public class ReviewQuestion22 {
    public static void main(String[] args) {
        var tailfeathers = 3;
        final var one = 1;
        switch(tailfeathers){
            case one :
                System.out.println(3 + " ");
            default: case 3:
                System.out.println(5 + " ");
        }
        while(tailfeathers>1){
            System.out.println(--tailfeathers + " ");
        }
    }
}
