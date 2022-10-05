package com.learn.BuildingBlocks;

public class Bird {//class definition block
    public static void main(String[] args) {//method declaration block
        {//inner block,not instance initializer,as it is only called when main() method is executed
            System.out.println("Feathers");
        }
    }
    {//instance initializer block,when you are counting instance initializer blocks,keep in mind they can not
        // exist inside of a method.
        System.out.println("Snowy");
    }
}
