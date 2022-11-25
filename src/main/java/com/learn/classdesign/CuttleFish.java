package com.learn.classdesign;

//Order of initialization
//1.Class initialization,static var in there order initialize then static initializer initialize in there order
//2.Then program move to main method and sout print.
//3.Instance var then instance initializer initialize in order there they are declare
//4.At last the object initialize calling constructor.

public class CuttleFish {
    private String name ="swimmy";//4
    {
        System.out.println(name);//5
    }
    private static int COUNT=0;//1
    static{
        System.out.println(COUNT);//2
    }
    {
        COUNT++;
        System.out.println(COUNT);//6
    }
    public CuttleFish(){
        System.out.println("Constractor");//7
    }

    public static void main(String[] args) {
        System.out.println("Ready");//3
        new CuttleFish();
    }
}
