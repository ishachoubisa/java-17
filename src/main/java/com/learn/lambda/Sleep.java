package com.learn.lambda;

public interface Sleep{
    private void snore(){}
    default int getZzz(){ return 1; }//not functional interface
}
