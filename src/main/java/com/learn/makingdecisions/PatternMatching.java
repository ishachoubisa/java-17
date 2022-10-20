package com.learn.makingdecisions;

public class PatternMatching {
    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;//this is boilerplate code,means the coded that is not needed or tends to duplicate
            // throughout a section of code over and over again in a similar manner. Boilerplate
            //or duplicate code for eg: getter and setter in a class say employee,comes again again
            //A cast is needed since compareTo() method is defined on Integer,but not on Number.
            //Integer class inherits from Number class
            System.out.println(data.compareTo(5));
        }
    }
//    void compareIntegers(Number number){
//        if(number instanceof Integer data){//The variable data here is referred to as the pattern variable. This code avoids two
//                                         //things 1. The extra casting statement (Integer data = (Integer)number) in above.
//                                         //2. The ClassCastException suppose we have cast the number variable to any other
//                                         //class of object class,it will produce ClassCastException and it will produce on run
    //time if not on compile time.
//            System.out.println(data.compareTo(5));
//        }
//    }

//    if(number instanceof Integer data){
//        data =10;//it is a bad practice to reassign a pattern variable.
//    }}

//    if(number instanceof final Integer data){
//     data =10;//DOES NOT COMPILE,final variable can not be reassigned. Consider pattern variable as final variable if the final
               //keyword is not there because it is a bad practice.
//}}
public static void main(String[] args) {
    PatternMatching p = new PatternMatching();
    p.compareIntegers(6);
}

}
