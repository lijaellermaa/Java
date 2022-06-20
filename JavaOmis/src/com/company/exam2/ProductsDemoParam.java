package com.company.exam2;

public class ProductsDemoParam extends ProductsDemo {
    String category;
    int id;
    int totalSales;

    ProductsDemoParam() {

    }

    ProductsDemoParam(String category, int id, int totalSales) {
        this.category = category;
        this.id = id;
        this.totalSales = totalSales;
    }

    ProductsDemoParam(String category, int id, int totalSales, String name, int price, int amount, String variety) {
        super(name, price, amount, variety);
        this.category = category;
        this.id = id;
        this.totalSales = totalSales;
    }

    public void tellName() {
        System.out.println(super.name);
    }
}
