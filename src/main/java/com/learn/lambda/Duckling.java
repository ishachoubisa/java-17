package com.learn.lambda;

public class Duckling {
    public static void makeSound(String sound){
        LearnToSpeak learner = s -> System.out.println(s);//lambda
       //LearnToSpeak learner = System.out::println;//method reference
        DuckHelper.teacher(sound,learner);
    }
}
