package com.learn.BeyondClasses;

//The list of values always come first,whether enum is simple or complex.

public enum Season4 implements Weather{
    WINTER,SPRING,SUMMER,FALL;
    public int getAverageTemperature(){
        return 10;
    }
}
