package com.learn.makingdecisions;

public class ReviewQuestion8 {
    void printTYpe(Object o){
        if(o instanceof Integer bat){
            System.out.println("int");
        } else if(o instanceof Integer bat&& bat <10) {
            System.out.println("small int");
        }
//        else if (o instanceof Long bat|| bat<=20) {//Does not compile.If bat is not Long,bat is not in scope.
//            System.out.println("long");
//        }default {//Does not compile,default can not be use as part of if/else statement.
//            System.out.println("unknown");
//        }
    }
}
