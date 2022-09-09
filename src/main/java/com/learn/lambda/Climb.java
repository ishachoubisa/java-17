package com.learn.lambda;

public interface Climb {
    void reach();
    default void fall(){}// valid functional interface(no matter how many methods are there
                         // it should have at least one abstract method)
}
