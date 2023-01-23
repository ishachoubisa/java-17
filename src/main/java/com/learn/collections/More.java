package com.learn.collections;

public class More {
    public static <T> void sink(T t){}
    public static <T> T identity(T t){return t;}
    //public static T noGood(T t){return T}//Does not compile,it omits formal parameter type and therefore does not compile.
}
