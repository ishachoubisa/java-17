package com.learn.lambda;

public class ParameterChecker {
    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        //StringParameterChecker lambda = s -> s.isEmpty();
        System.out.println(methodRef.check("Zoo"));
    }
}
