package com.learn.BuildingBlocks;

public class Egg {
    public Egg(){
        number = 5;//fourth
    }

    public static void main(String[] args) {
        Egg egg = new Egg();//first
        System.out.println(egg.number);//last
    }
    private int number = 1;//second
    {
        number = 3;//third
    }
}
