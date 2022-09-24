package com.learn.lambda;

import java.util.function.*;

public class Panda {
    int age;
    String name;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        System.out.println(p1);
        p1.age = 1;
        p1.age = 2;
        p1.name = "isha";
        check(p1,p -> p.age < 5);
        p1.age =3;//here we are changing the value of variable age but the object is same p1 it is not changed so no error
                  //variable which is used in lambda should be final or effectively final
        System.out.println(p1);
    }
    public static void check(Panda panda,Predicate<Panda> pred){
        System.out.println(panda);
        System.out.println(pred);
        String result = pred.test(panda)? "match" : "not match";
        System.out.println(result);
    }
}
