package com.learn.pond.goose;

import com.learn.pond.shore.Bird;

public class Gosling extends Bird {
    protected void swim(){
        floatInWater();//Protected access in subclass is OK.
        System.out.println(text);//Protected access in subclass is OK.
    }
}
