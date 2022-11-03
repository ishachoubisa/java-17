package com.learn.makingdecisions;

public class SwitchExp {

        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> 1;
            case 10 -> (short) 2;
            default -> 5;
            //case 20 -> 4L;//Does not compile.
            //case 40 -> "6";//Does not compile.
            //case 50 -> null;//Does not compile.
        };

}
