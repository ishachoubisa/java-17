package com.learn.lambda;

public class Climber {
    public static void main(String[] args) {
       // check((h,m) -> h.append(m).isEmpty(),5);//Does not compile we are providing here int to append method but it
                                                  //require StringBuilder variable.
    }
    private static void check(RQClimb climb,int height){
        if(climb.isTooHigh(height,10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}
