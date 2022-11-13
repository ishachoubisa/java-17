package com.learn.coreAPIs;

public class ReviewQuestion8 {
    public static void main(String[] args) {
        var String = "12345";
        var builder = new StringBuilder("12345");
       // System.out.println(builder.charAt(4));
        System.out.println(builder.replace(2,4,"6").charAt(3));
        //System.out.println(builder.replace(2,5,"6").charAt(2));
    }
}
