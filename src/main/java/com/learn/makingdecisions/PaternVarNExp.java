package com.learn.makingdecisions;

public class PaternVarNExp {
    void printIntegersGreaterThan5(Number number){
        if(number instanceof Integer data && data.compareTo(5)>0)//Notice we are using pattern variable in an expression in the
                                                                // same line where it is declared.
        {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        PaternVarNExp pe = new PaternVarNExp();
        pe.printIntegersGreaterThan5(10);
    }
}
