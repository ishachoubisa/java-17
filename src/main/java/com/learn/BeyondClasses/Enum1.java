package com.learn.BeyondClasses;

public class Enum1 {
    public static void main(String[] args) {
        var s = Season.Summer;
        System.out.println(Season.Summer);
        System.out.println(s==Season.Summer);


        //enum provide a values() method to get an array of all the values.
        for(var season: Season.values()){
            System.out.println(season.name()+ " " + season.ordinal());
        }

        //if(Season.Summer == 2)//Does not compile.enum is a type like Java class and not a primitive int.

        //Calling the valuesOf() method
        Season s1 = Season.valueOf("SUMMER");
        //Season t = Season.valueOf("summer");//IllegalArgumentException at run time.
    }
}
