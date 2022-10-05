package com.learn.BuildingBlocks;

// order of initialization
//first field and instance initializer blocks run in the order they are appear in the program
//at last the constructor runs.
public class Chick {
    private String name = "Fluffy";//second this will run
    {
        System.out.println("setting field");//third
    }
    public Chick(){
        name = "Tiny";//fourth
        System.out.println("setting constructor");//fifth
    }

    public static void main(String[] args) {
        Chick chick = new Chick();//first
        System.out.println(chick.name);//last
    }
}
