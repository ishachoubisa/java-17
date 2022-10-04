package com.learn.packageb;

import com.learn.packagea.ClassA;

//Compiling to same Directory
//to create a class in notepad in windows make folders in c drive like this c:\temp\packageb\ClassB.java
//to create a class in notepad in Mac/Linux make folders in c drive like this /tmp/packageb/ClassB.java
//to compile this class from cmd line in windows use javac packageb/ClassB.java
//to run use java packageb.ClassB

//Compiling to Another Directory
//command to compile:- javac -d classes packageb/ClassB.java
//command to run:- java -cp classes packageb.ClassB//it will compile it has main method.

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }
}
