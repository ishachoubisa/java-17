package com.learn.BeyondClasses;

//Defining different methods for each enum.

public enum Season3 {
    WINTER{
        public String getHour(){
            return "10am- 3pm";}
    },
    SUMMER{
        public String getHour(){
            return "10am- 7pm";
        }
    },
    SPRING,FALL;//special cases
    public String getHour(){ return "2am- 7pm";};//override it only for special cases.
    //public abstract String getHour();//enum has a abstract method every enum value should implement it
}
