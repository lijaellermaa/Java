package com.company;

public class PhonesDemo {

    String number;
    int price;
    String model = "Samsung";

    PhonesDemo() {

    }

    PhonesDemo(String m, String num, int p) {
        model = m;
        number = num;
        price = p;
    }

    public String Calling(String name) {
        return name + " " + number;
    }

}
