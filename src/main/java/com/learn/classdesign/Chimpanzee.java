package com.learn.classdesign;

//The compiler inserts the super() command as the first statement of both PrimateApe and ApeChimpanzee constructors.
public class Chimpanzee extends ApeChimpanzee{
    public Chimpanzee(){
        super(2);
        System.out.println("Chimpanzee");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
}
