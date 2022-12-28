package com.learn.BeyondClasses;

//Records include following members
//1. Overloaded and compact constructors
//2. Instance methods including overriding any provided methods(accessors,equals(),hashCode(),toString())
//3. Nested classes,interfaces,annotations,enum,and records.
//4. Static initializer is allowed.

public record Crane5(int numberEggs,String name) {
    @Override public int numberEggs(){
        return 10;
    }
    @Override public String toString(){ return name;}


    //you can add methods,static fields and other data types,you can not add instance fields outside the record declaration,
    //even if they are private.
    private static int type = 10;
    //public int size;
    //private boolean friend;

    static{
        type = 2;
    }//instance initializers are not allowed. All the initialization for fields of a record must happen in a constructor.

}
