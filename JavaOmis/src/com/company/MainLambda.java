package com.company;

public class MainLambda {
    public static void main(String[] args) {
        System.out.println(getTest().add(50, 80));
        int sum = getTest().add(60, 60);
        System.out.println("Sum is " + sum);
    }

    interface test {
        int add(int a, int b);
    }

    public static test getTest() {
        return (a, b) -> a + b;
    }
}
