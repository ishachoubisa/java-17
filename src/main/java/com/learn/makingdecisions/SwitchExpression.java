package com.learn.makingdecisions;

public class SwitchExpression {
    public void printDaysWeek(int day){
        var result = switch (day){
            case 0 -> "Sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        SwitchExpression se = new SwitchExpression();
        se.printDaysWeek(4);
    }
}
