package com.company;

import java.util.Scanner;

public class MainArrays5 {
    public static void main(String[] args) {
        String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July",
                                        "August", "September", "October", "November", "December"};
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number of month: ");
        num = scn.nextInt();
        num--;
        for (int i = 0; i < months.length; i++) {
            if (num == i) {
                System.out.println(months[i]);
            }
        }
    }
}
