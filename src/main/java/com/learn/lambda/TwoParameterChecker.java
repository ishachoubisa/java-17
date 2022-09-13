package com.learn.lambda;

public class TwoParameterChecker {
    public static void main(String[] args) {
        StringTwoParameterChecker methodRef = String::startsWith;
        //StringTwoParameterChecker lambda = (s,p) -> s.startWith(p);
        System.out.println(methodRef.check("Zoo","A"));
    }
}
