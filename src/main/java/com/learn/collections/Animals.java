package com.learn.collections;

public class Animals implements Comparable<Animals>{
    private int id;
    public int compareTo(Animals a){
        return id-a.id;
    }

    public static void main(String[] args) {
        var a1 = new Animals();
        var a2 = new Animals();
        a1.id=5;
        a2.id=7;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));

    }
}
