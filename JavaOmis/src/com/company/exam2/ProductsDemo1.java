package com.company.exam2;

public class ProductsDemo1 extends ProductsDemo {
    String name = "apple";
    int price;
    int amount;

    ProductsDemo1() {

    }

    ProductsDemo1(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void tellVariety() {
        System.out.println(super.variety);
    }
}
