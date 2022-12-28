package com.learn.BeyondClasses;

public class Fox {
    private class Den {
    }

    public void goHome() {
        new Den();
    }

    public static void visitFriend() {
        //new Den();//Does not compile
    }
}


