package com.learn.lambda;

//@FunctionalInterface
public interface Skip extends Sprint{
    void skip();//invalid functional interface(we can not put annotation on this as it will not compile
                //it has two abstract methods )
}
