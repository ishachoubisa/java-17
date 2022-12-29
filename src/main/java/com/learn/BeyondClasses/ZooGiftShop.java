package com.learn.BeyondClasses;

//Anonymous Class does not have a name.It is declared and instantiated all in one statement using new keyword,a type name with
//parentheses and set of braces{}.
//It must extend an existing class or implement an existing interface.

public class ZooGiftShop {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }
    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };//semicolon is required here.
        return basePrice - sale.dollarsOff();
    }
}
