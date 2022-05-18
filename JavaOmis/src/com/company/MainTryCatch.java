package com.company;

public class MainTryCatch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};
        try {
            int num = 5;
            arr[5] = 5;
            System.out.println(arr[4]);
            int num2 = num / 0;
            System.out.println(num2);
        } catch (Exception e) {
            System.out.println("Some error " + e);
        } finally {
            System.out.println("Hello World!");
        }
    }
}
