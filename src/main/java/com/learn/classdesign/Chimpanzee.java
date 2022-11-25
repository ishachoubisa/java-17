package com.learn.classdesign;

public class Chimpanzee extends ApeChimpanzee{
    public Chimpanzee(){
        super(2);
        System.out.println("Chimpanzee");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
}
