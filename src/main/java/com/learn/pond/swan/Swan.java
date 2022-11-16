package com.learn.pond.swan;

import com.learn.pond.shore.Bird;

public class Swan extends Bird {
   public void swim(){
        floatInWater();//Protected access is OK.
        System.out.println(text);//Protected access id OK.
    }

    public void helpOtherSwanSwim(){
        Swan swan = new Swan();
        swan.floatInWater();//subclass access to superclass
        System.out.println(swan.text);//subclass access to superclass
    }

    public void helpOtherBirdSwim(){
        Bird bird = new Bird();
        //bird.floatInWater();//DOE NOT COMPILE.Can not make object of superclass in subclass and use it to call members
                              // of superclass in subclass
        //System.out.println(bird.text);//DOES NOT COMPILE
    }
}
