package com.learn.collections;

import java.util.ArrayList;

public class Var {
    public static void main(String[] args) {
        var ArrList = new ArrayList<String>();//type of var is ArrayList<String>
        ArrList.add("a");
        for(String s : ArrList){}//we can add a String or loop through String objects.


        var list = new ArrayList<>();//it will compile,the type of var is ultimate super class i.e. Object

        list.add("a");//we can add a String value to list because it is subclass of Object class
       // for(String s : list){}//it does not compile because we loop through String objects required Object
    }
}
