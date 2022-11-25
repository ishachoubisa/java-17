package com.learn.classdesign;

public class ApeChimpanzee extends PrimateApe{
    public ApeChimpanzee(int age){
        super(3);
        System.out.println("Ape1-");
    }
    public ApeChimpanzee(){
        //super();//even if we comment this line it will implicitly calling no-arg const of parent class super()
        System.out.println("Ape2-");
    }
}
