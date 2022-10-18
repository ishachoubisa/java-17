package com.learn.operators;

public class ReviewQuestion2 {
    byte apples = 5;
    short oranges = 10;
    //int bananas = apples + oranges;//compile
    //byte bananas = apples + oranges;//does not compile. required byte provided int,byte is shorter then
                                     // int can not store int require type cast.
    //short bananas = apples + oranges;//does not compile,same reason
    //long bananas = apples + oranges;//compile
    //double bananas = apples + oranges;//compile
    float bananas = apples + oranges;
}
