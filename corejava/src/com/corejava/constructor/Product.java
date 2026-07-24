package com.corejava.constructor;

public class Product {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void show() {
        System.out.println("Product ID = " + productId);
        System.out.println("Product Name = " + productName);
        System.out.println("Price = " + price);
    }

    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 55000);

        p.show();

    }
}