package com.learn.operators;

public class ReviewQuestion3 {
    long ear = 10;
    //short ear = 10;
    //int hearing = 2 * (int)ear;//compile
    //int hearing = (int)(2 * ear);//compile
    //short hearing = 2*ear;//does not compile, require short provided long. long can not fit into smaller data type short
    //int hearing = 2 * ear;//does not compile,same reason
    long hearing = 2 * ear;
}
