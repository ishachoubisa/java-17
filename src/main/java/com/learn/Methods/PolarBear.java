package com.learn.Methods;

public class PolarBear {
    final int age=10;//instance variable got default value when not initialise but A final instance variable must recieve a value
                    //when it is declared or as part of initialization.
    final String name;
    final int fishEaten;

    {
        fishEaten =10;
    }

    public PolarBear(){
        name = "Robert";
    }
}
