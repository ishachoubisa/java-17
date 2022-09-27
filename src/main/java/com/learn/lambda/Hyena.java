package com.learn.lambda;

import java.util.function.Predicate;

public class Hyena {
    private int age =1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age =5;

        testLaugh(p,h -> h.age <5);//shenzi -> age==1
                                   //shenzi -> age==2 these two cannot be at place of lambda here as
                                   // age is not effectively final its changing
        age =2;//if remove this statement then age will be effectively final and the code will not produce error
    //we can not use p -> true as p is already define in the scope
    }
    static void testLaugh(Hyena panda, Predicate<Hyena> joke){
        var r = joke.test(panda)? "hahaha" : "silence";
        System.out.println(r);
    }
}
