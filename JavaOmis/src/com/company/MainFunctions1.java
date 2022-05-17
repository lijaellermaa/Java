package com.company;

public class MainFunctions1 {
    public static void main(String[] args) {
//        int summa;
//        summa = function(20, 30);
//        System.out.println(summa);
        System.out.println(function(4, 1));
        int num1, num2;
        num1 = 10;
        num2 = 10;
        System.out.println(function1(num1, num2));
        function2();
    }

    public static int function(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static int function1(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void function2() {
        int num1, num2, result;
        num1 = 15;
        num2 = 20;
        result = num1 + num2;
        System.out.println(result);
    }
}
