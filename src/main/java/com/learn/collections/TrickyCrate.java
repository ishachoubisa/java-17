package com.learn.collections;

public class TrickyCrate<T> {//This T is Robot
    public <T> T tricky(T t) {//T is String
        return t;
    }

    public static String crateName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bol");
    }
}