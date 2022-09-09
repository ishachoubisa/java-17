package com.learn.lambda;

//@FunctionalInterface
public interface InvalidFuncInterface {
    void move();//Does not compile(not following sam rule(Single abstract method))
    void rest();
}
