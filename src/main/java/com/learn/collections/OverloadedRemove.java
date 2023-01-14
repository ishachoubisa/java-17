package com.learn.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class OverloadedRemove {
    public static void main(String[] args) {
        var list = new LinkedList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(2);//remove value at index 2
        list.remove(Integer.valueOf(2));//remove value 2
        System.out.println(list);
        list.remove(100);//produce IndexOutOfBoundException
    }
}
