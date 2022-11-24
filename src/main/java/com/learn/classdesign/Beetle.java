package com.learn.classdesign;

public class Beetle extends Insect{
    protected int numberOfLegs = 6;
    short age;
    public void printData(){
        System.out.println(this.label);//label is defined in parent class,it is accessible via both this and super references.
                                       //this includes current and inherited members,super only includes inherited members.
        System.out.println(super.label);
        System.out.println(this.age);//age is defined in current class,making this accessible via this but not super.
        //System.out.println(super.age);//Does not compile.
        System.out.println(this.numberOfLegs);//it will print 6.
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
