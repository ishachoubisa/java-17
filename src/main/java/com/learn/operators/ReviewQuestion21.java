package com.learn.operators;

public class ReviewQuestion21 {
    public static void main(String[] args) {
        int myFavouriteNumber = 8;
        int bird = ~myFavouriteNumber;
        System.out.println(bird);
        int plane = -myFavouriteNumber;
        System.out.println(plane);
        var superman = bird == plane ? 5 : 10;
        System.out.println(bird+","+plane+","+ --superman);
    }
}
