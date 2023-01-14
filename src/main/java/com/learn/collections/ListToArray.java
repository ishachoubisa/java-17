package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("robin");
        list.add("mona");
        Object[] objectArray = list.toArray();//create array of class Object,this isn't what we want
        String[] stringArray = list.toArray(new String[0]);//the advantage of specifying a size of 0 for parameter is that
                                                            // java will create a new array of proper size for return value
        list.clear();//it will clear the original list does not affect either array
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);
    }
}
