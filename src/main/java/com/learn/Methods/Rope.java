package com.learn.Methods;

public class Rope {
    public static void swing(){
        System.out.println("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
       //climb();//DOES NOT COMPILE.It is not static.Static method can not call normal method.
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        System.out.println("-");
        rope2.play();//It will not throw NullPointerException because the method play() method is static and it is shared
                     // by all the instances(object) of class.If play() method is not static it will throw NullPointerException.

    }
}
