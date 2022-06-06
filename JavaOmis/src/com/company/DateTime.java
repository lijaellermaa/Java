package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj);

        LocalTime obj2 = LocalTime.now();
        System.out.println(obj2);

        LocalDateTime obj3 = LocalDateTime.now();

        DateTimeFormatter formatObj3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedObj3 = obj3.format(formatObj3);
        System.out.println(formattedObj3);
    }
}
