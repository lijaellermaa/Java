package com.company.exam4;

public class randomNumber {
    public static void main(String[] args) {
        int random = (int) Math.round(Math.random() * 100);
        System.out.println(randomNum(random));
    }

    public static boolean randomNum(int num) {
        if (num > 50) {
            return true;
        } else {
            return false;
        }
    }
}
