package com.learn.packagea;

//Compiling in same Directory
//to create a class in notepad in windows make folders in c drive like this c:\temp\packagea\ClassA.java
//to create a class in notepad in Mac/Linux make folders in c drive like this /tmp/packagea/ClassA.java
//to compile this class from cmd line in windows use javac packagea/ClassA.java
//to run use java packagea.ClassA


//Compiling in Another Directory
//command:- javac -d classes packagea/ClassA.java
//To run command:- java -cp classes packagea.ClassA// but is will not run because it does not have main method.
                 //java -classpath classes packagea.ClassA
                   //java --class-path classes packagea.ClassA

public class ClassA {
}
