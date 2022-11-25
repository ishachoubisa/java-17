package com.learn.classdesign;

//Before main() method was inside the class being executed(inside Hippo class),so it had to be loaded on startup.
//Here we are calling Hippo inside another program, the Hippo class not being loaded until it is needed inside main() method.

public class HippoFriend {
    public static void main(String[] args) {
        System.out.println("C");
        new Hippo();//it will print CAB
    }
}
