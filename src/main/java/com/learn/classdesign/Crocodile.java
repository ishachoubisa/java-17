package com.learn.classdesign;

public class Crocodile extends Reptile{
    private int speed =20;
    //This method is for new concepts
//    public int getSpeed(int speed){
//        int speed =40;//it will produce error,either you can declare the parameter of method or local variable of method
                        //speed not both together.Here you are redeclaring variable speed in same scope.
//        return speed;
//    }

//    public int getSpeed(){
//        return speed;//Java first check to see if there is a local variable or method parameter named speed.Since there is
//                    // not,it then checks this.speed and since it exists,the program prints 20
//    }
    public int getSpeed(){
        return super.speed;//it will print speed of super class. i.e. 10
    }

    public static void main(String[] data) {
        var croc = new Crocodile();//the instance of Crocodile stores two separate values for speed,one at Reptile level
                                   //one at Crocodile level
        System.out.println(croc.getSpeed());//it will check for this.speed(instance variable speed of subclass Crocodile) and
                                            // print 20.
    }
}
