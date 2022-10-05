package com.learn.BuildingBlocks;

public class WrapperC {
    int primitive = Integer.parseInt("123");//converts String to an int primitive
    Integer wrapper = Integer.valueOf("123");//converts String to an Integer wrapper class

    Double apple = Double.valueOf("200.99");

    public static void main(String[] args) {
        WrapperC wc = new WrapperC();
        System.out.println(wc.apple.intValue());//converts to an int primitive//ans-- 200
        System.out.println(wc.apple.byteValue());//converts to an byte primitive//ans -- -56
        System.out.println(wc.apple.doubleValue());//converts to an double primitive//ans -- 200.99
    }
}
