package com.learn.Methods;

public class StringBuilders {
    public static StringBuilder work(StringBuilder a,StringBuilder b){
        a= new StringBuilder("a");//Java is pass by value assigning a new object to a does not change the caller.
        b.append("b");//They both b method parameter and s2 caller have reference to same object
        return a;
    }

    public static void main(String[] args) {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1,s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);//this will output a
    }
}
