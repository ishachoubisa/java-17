package com.learn.lambda;

public class MySecret {
    public static void main(String[] args) {
        //Secret lambda = (e) -> "Poof";//it will compile
       //Secret lambda = (e) -> { "Poof"};//does not compile because missing return statement and semicolon.
        //Secret lambda = (e) -> {String e = ""; "Poof"}//does not compile e is already define in scope,missing return statement and semicolon
       // Secret lambda = (e) -> {String e = ""; return "Poof";};//does not compile e is already define in scope.
        // Secret lambda = (e) -> {String e = ""; return "Poof"};//does not compile e is already define and missing semicolon.
        Secret lambda = (e) -> {String f = ""; return "Poof";};
    }





}
