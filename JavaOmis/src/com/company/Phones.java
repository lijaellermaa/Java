package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo phone1 = new PhonesDemo();
        PhonesDemo phone2 = new PhonesDemo();
        PhonesDemo phone3 = new PhonesDemo("Xiaomi", "58586080", 400);
        PhonesDemo1 phone4 = new PhonesDemo1();
        PhonesDemo1 phone5 = new PhonesDemo1("LG", "55556666", 555);
        PhonesDemo1 phone6 = new PhonesDemo1("Apple", "55559999");
        PhonesDemoParam phone7 = new PhonesDemoParam();
        PhonesDemoParam phone8 = new PhonesDemoParam("KitKat", 8, 256);
        PhonesDemoParam phone9 = new PhonesDemoParam("KitKat", 8, 256, "Nokia", "48437589", 100);
        PhonesDemoParam phone10 = new PhonesDemoParam("Lollipop", 4, 300, "Apple", "11117777", 700);

        phone7.core = 8;
        phone7.memory = 128;
        phone7.system = "IOS";

        phone1.number = "47399577";
        phone1.price = 600;

        System.out.println(phone1.model + " " + phone1.number + " " + phone1.price);

        phone2.number = "45874577";
        phone2.price = 900;
        phone2.model = "Apple";

        System.out.println(phone2.model + " " + phone2.number + " " + phone2.price);
        System.out.println(phone3.model + " " + phone3.number + " " + phone3.price);

        System.out.println("Calling " + phone2.Calling("Mom"));

        System.out.println(phone5.model + " " + phone5.number + " " + phone5.price + "\n");

        System.out.println(phone7.system + " " + phone7.core + " " + phone7.memory);
        System.out.println(phone8.system + " " + phone8.core + " " + phone8.memory);
        System.out.println(phone9.system + " " + phone9.core + " " + phone9.memory + " " + phone9.model + " " + phone9.number + " " + phone9.price);

        phone9.tellModel();
        phone10.tellPhone10();
    }
}
