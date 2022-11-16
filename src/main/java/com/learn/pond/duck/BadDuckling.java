package com.learn.pond.duck;

public class BadDuckling {
    public static void main(String[] args) {
        FatherDuck duck = new FatherDuck();
       // duck.quack();//Does not compile.It tries to access private method in another class
        //System.out.println(duck.noise);//Does not compile.Private instance variable in another class.
    }
}
