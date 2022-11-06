package com.learn.makingdecisions;

public class ReviewQuestion26 {
    public static void main(String[] args) {
        int w = 0,r = 1;
        String name = "";
        while(w<2){
            name +="A";
            do{
                name+="B";
                if(name.length()>0) {name+="C";
                System.out.println(name);}
                else break;
            }while (r>+1);//infinite loop
            r++;w++;
        }
        System.out.println(name);
    }
}
