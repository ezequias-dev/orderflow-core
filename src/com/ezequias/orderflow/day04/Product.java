package com.ezequias.orderflow.day04;

public class Product {
    String name;
    double price;
    int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}