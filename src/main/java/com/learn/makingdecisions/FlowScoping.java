package com.learn.makingdecisions;

public class FlowScoping {
//        void printIntegerOrNumbersGreaterThan5(Number number){
//            if(number instanceof Integer data || data.compareTo(5)>0)//Does not compile.if data is an instance of integer
                                                                       // it is in scope otherwise is not in scope
//                Integer data = (Integer)number;
//                System.out.println(data);
//        }

//        void printIntegerTwice(Number number){
//            if(number instanceof Integer data)
//                System.out.println(data.intValue());
//            System.out.println(data.intValue());//Does not compile.data is no longer in scope after if statement.
//        }

        void printOnlyIntegers(Number number){
            if(!(number instanceof Integer data))
                return;//method return if input does not inherited Integer.This means that when last line of method reached
                      // ,the input must inherit Integer,and therefore data stays in scope even after if statement ends.
            System.out.println(data);
        }
}
