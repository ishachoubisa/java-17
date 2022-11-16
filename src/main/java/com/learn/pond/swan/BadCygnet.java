package com.learn.pond.swan;

import com.learn.pond.duck.MotherDuck;

public class BadCygnet {
    void makenoise() {
        var duck = new MotherDuck();
        //duck.quack();//Package access is not allowed in class in different package
        //System.out.println(duck.noise);//
    }
}
