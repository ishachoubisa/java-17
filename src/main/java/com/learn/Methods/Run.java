package com.learn.Methods;

public class Run {
    static void execute(){
        System.out.println("1-");
    }
    static void execute(int num){
        System.out.println("2-");
    }
    static void execute(Integer num){
        System.out.println("3-");
    }
    static void execute(Object num){
        System.out.println("4-");
    }
    static void execute(int... num){
        System.out.println("5");
    }

    public static void main(String[] args) {
        Run.execute(100);
        Run.execute(100L);
    }
}
