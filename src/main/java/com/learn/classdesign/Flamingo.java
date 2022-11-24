package com.learn.classdesign;

public class Flamingo {
    private String color;
//    public void setData(String color){
//        color = color;//Both instance variable and parameter of method has same name so here it is initializing parameter
//                      // in parameter.It is not initializing parameter of method to instance variable to do so we use this
//                      // keyword.
//    }
    public void setData(String color){
        this.color = color;//Here this.color is refering to instance variable color of the class.We are initializing color
                           // parameter of method to the instance variable color of the class.
    }

    public static void main(String[] args) {
        var f = new Flamingo();
        f.setData("PINK");
        System.out.println(f.color);
    }
}
