package com.learn.makingdecisions;

public class ReviewQuestion28 {
    static void getFish(Object fish) {
        if (!(fish instanceof String guppy))
            System.out.println("Eat!");
//        else if (!(fish instanceof String guppy)) {//Does not compile,guppy is already defined in scope.
//            throw new RuntimeException();
//        }
        System.out.println("Swim");
    }

    public static void main(String[] args) {
        getFish("goldie");
    }
}