package com.company;

import java.util.Scanner;

public class MainIfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        num = scn.nextInt();

//          || &&
//        if (num > 10 && num == 15) {
//            System.out.println("num is bigger than 10");
//        } else {
//            System.out.println("number is less than 10");
//        }

        if (num == 5) {
            System.out.println("Number is 5");
        } else if (num == 10) {
            System.out.println("Number is 10");
        } else {
            System.out.println("Number is some number, but not 5 or 10");
        }
    }
}
