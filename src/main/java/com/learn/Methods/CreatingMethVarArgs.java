package com.learn.Methods;

//RULES FOR VARARGS PARAMETER
//1. A method can have at most one varargs parameter.
//2.If method contains a varargs parameter,it must be last parameter in list.

public class CreatingMethVarArgs {
    public void walk1(int... steps){}
    public void walk2(int start,int... steps){}
    //public void walk3(int... steps,int start){}//DOES NOT COMPILE
    //public void walk4(int... start,int... steps){}//DOES NOT COMPILE
}
