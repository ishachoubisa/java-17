package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck>{
    private String name;
    public Duck(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
    public int compareTo(Duck d){
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("quack"));
        ducks.add(new Duck("tom"));
        Collections.sort(ducks);
        System.out.println(ducks);

    }
}
