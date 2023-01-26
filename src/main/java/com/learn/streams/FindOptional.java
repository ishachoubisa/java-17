package com.learn.streams;

import java.util.Optional;

//How do we express this"we don't know" or "not applicable" answer in Java?We use the Optional type.Think of an
// Optional as a box that might have something in it or might instead be empty.

public class FindOptional {
    public static Optional<Double> average(int... scores){
        if(scores.length==0) return Optional.empty();//returns an empty Optional.
        int sum = 0;
        for(int score:scores)
            sum+=score;
        return Optional.of((double)sum/scores.length);//creates an Optional to wrap the average.
    }



    public static void main(String[] args) {
        FindOptional fo = new FindOptional();

        //Calling the method shows what is in our boxes.
        System.out.println(average());
        System.out.println(average(90,100));

        //Normally,we want to check whether a value is there and/or get it out of box.
        Optional<Double> opt = average(90,100);
        if(opt.isPresent())
            System.out.println(opt.get());

        //If we didn't do the check and the Optional was empty. We would get an exception since there is no value inside the
        //Optional.
       Optional<Double> opt1 = average();
        System.out.println(opt1.get());//NoSuchElementException


        //When creating an Optional,it is common to want to use empty() when there is no value or value is null.We ternary
        //operator(? :) to simply the code.
        Optional o = (opt== null)?Optional.empty():Optional.of(opt);
        System.out.println(o);


        //Java provide a factory method to do the same above thing.
        Optional o1 = Optional.ofNullable(opt1);
        System.out.println(o1);

       // Instead of using if statement,which we used when checking the average earlier,we can specify a Consumer to be run
        // when there is a value inside the Optional. When there isn't,the method simply skips running the Consumer.
        Optional<Double> opt3 = average(90,100);
        //opt3.isPresent(System.out::println);

    }
}
