package com.learn.Methods;

public class Test {
    public void print(byte x){
        System.out.println("byte-");
    }
    public void print(int x){
        System.out.println("int-");
    }
    public void print(float x){
        System.out.println("float-");
    }
    public void print(Object x){
        System.out.println("object-");
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s =123;
        t.print(s);
        t.print(true);//it will print object-,the boolean is autoboxed to Boolean Wrapper class(Object).
        t.print(6.789);//it will print object-,the double is autoboxed to Double Wrapper class(Object).
    }
}
