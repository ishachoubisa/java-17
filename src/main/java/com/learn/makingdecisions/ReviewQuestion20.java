package com.learn.makingdecisions;

public class ReviewQuestion20 {
    public static void main(String[] args) {
        int height = 1;
        L1: while (height++<10){
            long humidity =12;
            System.out.println("height"+height+","+"humidity"+humidity);
            L2: do {
            if(humidity--%12==0) break L2;
                int temperature = 30;
                System.out.println("temperature"+temperature+","+"humidity"+humidity);
            L3: for(;;){
                temperature++;
                System.out.println("temperature1 "+temperature);
                if(temperature>50) break L1;
            }
            }while (humidity>4);
        }
    }
}
