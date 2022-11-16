package com.learn.pond.goose;

import com.learn.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseToSwim(){
        Goose other = new Goose();
        other.floatInWater();//Protected access id OK
        System.out.println(other.text);//Protected access is OK.
    }

    public void helpOtherGooseToSwim(){
        Bird other = new Goose();
        //other.floatInWater();//DOES NOT COMPILE.Object is of subclass but the refrence to it is of superclass,can not be use
                               //to access members of superclass.
        //System.out.println(other.text);//DOES NOT COMPILE
    }
}
