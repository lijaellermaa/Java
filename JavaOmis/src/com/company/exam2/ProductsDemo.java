package com.company.exam2;

public class ProductsDemo {
    String name;
    int price;
    int amount;
    String variety;

    ProductsDemo() {

    }

    ProductsDemo(String name, int price, int amount, String variety) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.variety = variety;
    }

    ProductsDemo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String cost(String name) {
        return name + ": " + price;
    }
}
