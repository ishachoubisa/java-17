package com.learn.pond.inland;

import com.learn.pond.shore.Bird;

public class BirdWatcherFromAFar {
    public static void main(String[] args) {
        Bird bird = new Bird();
        //bird.floatInWater();//Protected access in different package is not allowed.Only if it is a subclass.
        //System.out.println(bird.text);
    }
}