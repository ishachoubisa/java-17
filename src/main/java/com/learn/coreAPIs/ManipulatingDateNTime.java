package com.learn.coreAPIs;

import java.time.*;

public class ManipulatingDateNTime {
    public static void main(String[] args) {
        var date = LocalDate.of(2022,7,15);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusMonths(2);
        System.out.println(date);
        date = date.plusYears(1);
        System.out.println(date);


        //LocalDateTime
        var date1 = LocalDate.of(2022,12,23);
        var time = LocalTime.of(5,30,25);
        var dateTime = LocalDateTime.of(date1,time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(6);
        System.out.println(dateTime);
        dateTime = dateTime.minusMonths(12);
        System.out.println(dateTime);
        dateTime = dateTime.minusYears(12);
        System.out.println(dateTime);

        //LocalDateTime method chaining
        var date2 = LocalDate.of(2022,7,18);
        var time1 = LocalTime.of(8,43,59);
        var dateTime1 = LocalDateTime.of(date2,time1).minusHours(24).minusMinutes(25).minusSeconds(20);
        System.out.println(dateTime1);

        //date and time classes are immutable
        var date3 = LocalDate.of(2024,11,5);
        date3.plusDays(10);//There will be no changes in date.
        System.out.println(date3);

        //Adding subtracting correct
        var date4 = LocalDate.of(2024,9,26);
        //date4 = date4.plusMinutes(1);//Does not compile.You can not add minutes that is time in date object.
    }
}
