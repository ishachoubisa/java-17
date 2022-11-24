package com.learn.classdesign;

public class Lion extends Animal{
    public void setProperties(int age,String n){
        setAge(age);//age is private variable in Animal class(parent) but it can be indirectly access through public method
                    // of that class by calling in subclass Lion public method.
        name=n;
    }
    public void roar(){
        System.out.println(name+" of age "+getAge()+" says roar!");//age(private variable) is accessed indirectly but can not
                                                                  // be access directly in subclass.
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3,"kion");
        lion.roar();
    }
}
