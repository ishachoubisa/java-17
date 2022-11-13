package com.learn.coreAPIs;

import java.time.*;

public class LocalDateNTime {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());


        var date1 = LocalDate.of(2022, 1, 20);
        var date2 = LocalDate.of(2023,7,23);

        System.out.println(date1);
        System.out.println(date2);

        //Method signature of LocalDate
//        public static LocalDate of(int year,int month,int dayOfMonth);
//        public static LocalDate of(int year,Month month,int dayOfMonth);

        var time1 = LocalTime.of(4,30);
        var time2 = LocalTime.of(4,30,12);
        var time3 = LocalTime.of(5,30,12,55);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        //Method signature of LocalTime
        //public static LocalTime of(int hour,int min);
        //public static LocalTime of(int hour,int min,int sec);
//      public static LocalTime of(int hour,int min,int sec,int nanosec);

        var dateTime1 = LocalDateTime.of(2022,5,26,5,30);
        var dateTime2 = LocalDateTime.of(2022,6,15,7,15,20);
        var dateTime3 = LocalDateTime.of(2022,6,12,6,30,45,54);
        var dateTime4 = LocalDateTime.of(date1,time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);

        //Method signature of LocalDateTime
        //public static LocalDateTime of(int year,int month,int dayOfMonth,int hour,int min);
        //public static LocalTime of(LocalDate date,LocalTime time);

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022,11,28,5,30,29,45,zone);
        var zoned2 = ZonedDateTime.of(date1,time1,zone);
        var zoned3 = ZonedDateTime.of(dateTime1,zone);

        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);

        //Method signature of ZonedDateTime
        //public static ZonedDateTime of(int year,int month,int dayOfMonth,int hour,int min,int sec,int nanos,ZoneId zone);
    }
}
