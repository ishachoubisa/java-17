package com.learn.Methods;

import java.util.*;
//import static java.util.Collections//DOES NOT COMPILE,classes such Collections require a regular import.
import static java.util.Collections.*;
//import static java.util.Collections.sort;//This is a valis way.
//import static java.util.Collections.sort(ArrayList<String>)//DOES NOT COMPILE,Method parameter have no business in an import.
//static import java.util.Collections.*;//DOES NOT COMPILE,invalid syntax.


public class Imports {
    public void method(ArrayList<String> list){
        sort(list);
    }
}
