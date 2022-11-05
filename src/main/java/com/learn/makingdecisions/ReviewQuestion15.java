package com.learn.makingdecisions;

public class ReviewQuestion15 {
    public static void main(String[] args) {
       final char a = 'A', e = 'E';
       char grade = 'B';
       switch (grade){
           default:
           case a:
          // case 'B':'C':System.out.println("great");//Does not compile,because instead of colon comma should be use to separate
               //combined case statements.
           case 'D':
               System.out.println("good");break;
           case e:
           case 'F':
               System.out.println("not good");
       }
    }
}
