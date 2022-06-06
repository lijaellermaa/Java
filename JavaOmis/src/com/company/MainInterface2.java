package com.company;

public class MainInterface2 {
    public static void main(String[] args) {
        ArrayInterface2 array = new MyArray2();
        System.out.println(array.add(1));
        System.out.println(array.add(7));
        System.out.println(array.add(3));
        System.out.println(array.add(5));

        System.out.println(array.get(1));

        ArrayInterface2 names = new MyArray2();
        System.out.println(names.addName("Anna"));
        System.out.println(names.addName("Ekaterina"));
        System.out.println(names.addName("Alexander"));
        System.out.println(names.addName("Elizabeth"));
        System.out.println(names.addName("Vlad"));

        names.getForm();
    }
}
