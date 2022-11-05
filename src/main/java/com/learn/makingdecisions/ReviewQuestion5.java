package com.learn.makingdecisions;

import java.util.ArrayList;
import java.util.List;

public class ReviewQuestion5 {
    public static void main(String[] args) {
        List<Integer> myFavouriteNumbers = new ArrayList<>();
        myFavouriteNumbers.add(10);
        myFavouriteNumbers.add(14);

        for (var a : myFavouriteNumbers) {
            System.out.println(a + ",");
            break;
        }
//        for (int b : myFavouriteNumbers) {
//            continue;
//            System.out.println(b + ",");
//        }
        for (Object c : myFavouriteNumbers)
            System.out.println(c + ",");
    }
}
