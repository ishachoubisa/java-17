package com.learn.Methods;

public class DogWalker {
    public static void walkDog(int start,int... steps){
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);
        walkDog(1,2);
        walkDog(1,2,3);
        walkDog(1,new int[]{4,5});
        //walkDog(1,null);
    }
}
