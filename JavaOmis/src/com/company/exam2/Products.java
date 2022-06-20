package com.company.exam2;

public class Products {
    public static void main(String[] args) {
        ProductsDemo product = new ProductsDemo();
        product.name = "Apple";
        product.price = 5;
        product.amount = 1;
        product.variety = "green";
        System.out.println(product.name + " " + product.price + " " + product.amount + " " + product.variety);

        ProductsDemo product1 = new ProductsDemo("Blueberry", 15, 20, "blue");
        System.out.println(product1.name + " " + product1.price + " " + product1.amount + " " + product1.variety);

        ProductsDemo1 product2 = new ProductsDemo1();
        product2.name = "Strawberry";
        product2.price = 5;
        product2.amount = 1;
        product2.variety = "red";
        System.out.println(product2.name + " " + product2.price + " " + product2.amount + " " + product2.variety);

        ProductsDemoParam product3 = new ProductsDemoParam("Fruits", 1, 500, "Pear", 3, 1, "green");
        System.out.println(product3.category + " " + product3.id + " " + product3.totalSales + " " +
                product3.name + " " + product3.price + " " + product3.amount + " " + product3.variety);
        product3.tellName();
    }
}
