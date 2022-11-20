package com.learn.Methods;

public class ReviewQuestion12 {
    public void feed(){
        int monkey = 0;
        if(monkey>0){
            var girrafe = monkey++;//This is effectively final once set it is not changed,you can also check by putting
                                       // final specifier.
            System.out.println(girrafe);
            String name;//This is effectively final.
            name = "geoffrey";
            System.out.println(name);
        }
        String name = "milly";
        System.out.println(name);
        var food = 10;
        System.out.println(food);
        while(monkey<=10){
            food=0;
            System.out.println(food);
        }
        name = null;
        System.out.println(name);
    }

    public static void main(String[] args) {
        ReviewQuestion12 rq = new ReviewQuestion12();
        rq.feed();
    }
}
