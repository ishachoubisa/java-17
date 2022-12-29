package com.learn.BeyondClasses;

//Local class have the following properties:
//not have an access modifier.
//can be declared final or abstract.
//have access to all fields and methods of enclosing class.
//can access final and effectively final local variables.If local variables it used are not final or effectively then it will
//produce compilation error.

public class PrintNumber {
    private int length = 20;
    public void calculate(){
        final int width =5;
         class Calculator{
         public void multiply(){
             System.out.println(length*width);
         }
        }
        var calc = new Calculator();
        calc.multiply();
    }

    public static void main(String[] args) {
        var printer = new PrintNumber();
        printer.calculate();
    }
}
