package com.learn.lambda;

import java.util.function.Predicate;

public class LocalVarLambda {
    public static void main(String[] args) {
      //  public void variables(int a)
        {
            int b =1;
            Predicate<Integer> p1 = d -> {
              //  int b = 0;
                int c = 0;
                return b==c;
            };
        }
    }
}
