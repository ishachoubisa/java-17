package com.learn.makingdecisions;

public class ReviewQuestion27 {
    public static void main(String[] args) {
        byte amphibian = 1;
        String name = "Frog";
        String color = switch(amphibian){
            case 1 -> {yield "RED";}
            //case 2 -> {if(name.equals("Frog")) yield "Green";}//does not compile,else statement is missing required here.
            case 3 -> { yield "Purple";}
            default -> throw new RuntimeException();
        };
        System.out.println(color);
    }
}
