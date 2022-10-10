package com.learn.BuildingBlocks;

public class FinalLocVar {
    public static void main(String[] args) {
        final int y = 10;
        int x = 20;
        //y = x + 10;//Does not compile,y is final cannot be change

        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[0] = 30;
        favoriteNumbers[1] = 20;
        //favoriteNumbers = null;//we can change the content or value in the array,but cannot change the value
                                 // of reference
    }
}
