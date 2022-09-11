package com.learn.lambda;

public class CheckingStr {
    public static void main(String[] args) {
        var str = "";
        StringCheck methodRef = str::isEmpty;
        //StringCheck lambda = () ->str.isEmpty();
        System.out.println(methodRef.check());
    }
}
