package com.learn.Methods;

public class Penguin {
    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "lilly";
        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin="Willy";
        System.out.println(p1.name);
        System.out.println(p1.nameOfTallestPenguin);//one copy of it share by all instances of class Penguin
        System.out.println(p2.name);
        System.out.println(p2.nameOfTallestPenguin);
    }
}
