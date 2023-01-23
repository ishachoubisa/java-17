package com.learn.collections;

public class Handler {
    public static <T> void prepare(T t){//Before return type, we declare formal parameter type of<T>
        System.out.println("Preparing t"+ t);
    }
    public static <T> Crate<T> ship(T t){//we show how you can use generic parameter in return type.
        System.out.println("Shipping t"+t);
        return new Crate<T>();
    }
}
