package com.learn.BeyondClasses;

public class Favorites {
    public static void main(String[] args) {
        for(final var e : Flavors.values())
            System.out.println(e.ordinal());
    }
}
