package com.learn.BeyondClasses;

public class Owl implements HasBigEyes{
    @Override
    public int hunt() {
        return 2;
    }

    @Override
    public void flap() {
        System.out.println("Flap");
    }
}
