package com.learn.pond.duck;

public class GoodDuckling {
    void makenoise(){
        var duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);//Package access in same package but different class is OK.
    }
}
