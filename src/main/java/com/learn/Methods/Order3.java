package com.learn.Methods;

public class Order3 {
    final String value1 = "red";
    static String value2 = "blue";
    String value3 = "yellow";
    {
        //value1 = "green";
        value2 = "orange";
        value3 = "purple";
    }
    static {
        value2= "grey";
    }
}
