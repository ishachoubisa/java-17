package com.learn.operators;

public class ReviewQuestion17 {
    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken += 2;
        ticketsSold += (long) 1;

    }
}