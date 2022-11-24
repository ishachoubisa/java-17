package com.learn.classdesign;

public class Duck {
    private String name;
    private int height;
    private int length;
    public void setData(int length,int theHeight,String n){
        length = this.length;//Backward is not good,here we are initializing instance variable to parameter of method.
                             //this.length refer to instance variable of the class and instance variable length is not changed.
        height = theHeight;//here this keyword is not require different name of instance variable and parameter
        this.name = n;//here this keyword can be or can not be use no difference no error.
    }

    public static void main(String[] args) {
        var d = new Duck();
        d.setData(1,2,"puma");
        System.out.println(d.length+" "+d.height+" "+d.name);
    }
}
