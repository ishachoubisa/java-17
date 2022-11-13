package com.learn.coreAPIs;


//Important points to remember
//1. Power(exponent) method return double.
//2. Round method return int for float parameter, and return long for double parameter.
//3. Random method return double.

public class ReviewQuestion6 {
    public static void main(String[] args) {
        double one = Math.pow(1,2);
        //int two = Math.round(1.0);//Does not compile. Round method takes float and return int. If it takes double as parameter
                                  //then it return long.Here it is returning long,long can not be insert in int we have to type
                                  // cast it to remove the compilation error.
        //float three = Math.random();//Does not compile. Provided float required double,otherwise type cast it to float then
                                    //the compilation error will remove.
       // var doubles = new double[]{one,two,three};
    }
}
