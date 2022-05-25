package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo phone1 = new PhonesDemo();
        PhonesDemo phone2 = new PhonesDemo();
        PhonesDemo phone3 = new PhonesDemo("Xiaomi", "58586080", 400);

        phone1.number = "47399577";
        phone1.price = 600;

        System.out.println(phone1.model + " " + phone1.number + " " + phone1.price);

        phone2.number = "45874577";
        phone2.price = 900;
        phone2.model = "Apple";

        System.out.println(phone2.model + " " + phone2.number + " " + phone2.price);

        System.out.println(phone3.model + " " + phone3.number + " " + phone3.price);

        System.out.println("Calling " + phone1.Calling());
    }
}
