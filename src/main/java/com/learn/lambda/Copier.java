package com.learn.lambda;

public class Copier {
    public static void main(String[] args) {
        StringCopier methodRef = String::new;
        //StringCopier lambda = (x) -> new String(x);
        var myString = methodRef.copy("Zebra");
        System.out.println(myString.equals("Zebra"));
    }
}
