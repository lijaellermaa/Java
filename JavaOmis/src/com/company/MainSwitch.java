package com.company;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        num = scn.nextInt();

        switch (num) {
            case 10:
                System.out.println("Number is 10");
                break;
            case 15:
                System.out.println("Number is 15");
                break;
            default:
                System.out.println("Some number");
        }
    }
}
