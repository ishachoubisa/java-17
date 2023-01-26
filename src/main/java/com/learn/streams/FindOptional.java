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

        //Dealing with empty Optional
        //remaining methods allow you to specify what to do if a value isn't present.
        Optional<Double> opt4 = average();
        System.out.println(opt4.orElse(Double.NaN));//you can return a specific value or variable. In our case we print the
                                                    //"not a number" value
        System.out.println(opt4.orElseGet(()-> Math.random()));//Using Supplier to generate a value at runtime to return instead
        System.out.println(opt4.orElseThrow());//Throw an exception if the Optional is empty. Without specifying a Supplier
                                                 //for the exception,Java will throw NoSuchElementException
        System.out.println(opt4.orElseThrow(()-> new IllegalStateException()));//We can have a code throw a custom exception
                                                                              //if the Optional is empty


        //The two methods that take a Supplier have different names.
        //System.out.println(opt4.orElseGet(()-> new IllegalStateException()));//DOES NOT COMPILE
        // The opt4 variable is an Optional<Double>.This means the Supplier must return a Double.
        // Since this Supplier returns an exception,the type does not match.

        //What do you think this does?
        Optional<Double> opt5 = average(90,100);
        System.out.println(opt5.orElse(Double.NaN));//95.0
        System.out.println(opt5.orElseGet(()-> Math.random()));//95.0
        System.out.println(opt5.orElseThrow());//95.0
        System.out.println(opt5.orElseThrow(()-> new IllegalStateException()));//95.0
    }
}
