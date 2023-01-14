package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("NY");
        System.out.println(list);
        list.add(0,"XY");
        System.out.println(list);
        list.set(1,"FL");
        System.out.println(list.get(0));
        list.remove("XY");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(0,"?");
    }
}