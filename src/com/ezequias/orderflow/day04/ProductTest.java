package com.ezequias.orderflow.day04;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();

        product.name = "Mouse";
        product.price = 150.0;
        product.stockQuantity = 3;

        System.out.println("Name: " + product.name);
        System.out.printf("Price: $%.2f%n", product.price);
        System.out.println("Stock: " + product.stockQuantity);
    }
}