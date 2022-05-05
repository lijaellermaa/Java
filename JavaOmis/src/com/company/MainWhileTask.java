package com.company;

public class MainWhileTask {
    public static void main(String[] args) {
        int num = 3;
        int range = 1;
        int result = 1;

        while (true) {
            result = result * num;
            System.out.println(num + "** " + range + " = " + result);
            range++;
            if (range > 5) {
                break;
            }
        }
    }
}
