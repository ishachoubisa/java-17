package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class WithoutGeneric {
    static void printNames(List list){
        for(int i=0;i<list.size();i++){
            String name =(String) list.get(i);//ClassCastException
        }
    }

    public static void main(String[] args) {
        //Without generic
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);

        //with generic
        List<String> names1 = new ArrayList<String>();
        //names1.add(new StringBuilder("Webby"));//Does Not Compile
    }
}
