package com.learn.BeyondClasses;

//Inner class,it can include static variables and methods.

public class Home {
    private String greetings = "Hi";//outer class instance variable


    protected class Room{  //inner class declaration
        public int repeat = 3;
        public void enter(){
            for(int i=0;i<repeat;i++){
                System.out.println(greetings);
            }
        }
        private static void greet(String message){//in java 11 this produce compile error, previously static nested classes
                                                  //are allowed to include static methods.
            System.out.println(message);
        }
    }

    public void enterRoom(){ //outer class instance method
        var room = new Room();//create inner class instance
        room.enter();
    }

    public static void main(String args[]){
        var home = new Home();//create outer class instance
        home.enterRoom();
    }

}
