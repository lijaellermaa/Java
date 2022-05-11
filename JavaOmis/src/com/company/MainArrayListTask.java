package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainArrayListTask {
    public static void main(String[] args) {
        String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        int i = 0;
        for (String element : months) {
            months[i] = element.toLowerCase();
            i++;
        }
        System.out.println(Arrays.toString(months));

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the month: ");
        String someMonth = scn.nextLine();

        if (Arrays.asList(months).contains(someMonth)) {
            System.out.println(Arrays.asList(months).indexOf(someMonth) + 1);
        } else {
            System.out.println("error!");
        }
    }
}
