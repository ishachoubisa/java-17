package com.learn.Methods;

public class EffectivelyFinLoc {
    public String zooFriends(){
        String name = "Harry the Hippo";//Effectively final
        var size = 10;//not effectively final its changing
        boolean wet;//Effectively final
        if(size>100) size++;
        name.substring(0);//string is immutable.
        wet = true;
        return name;
    }
}
