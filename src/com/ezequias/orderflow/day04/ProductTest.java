package com.ezequias.orderflow.day04;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Keyboard", 150.0, 3);

        System.out.println("Name: " + product.name);
        System.out.printf("Price: $%.2f%n", product.price);
        System.out.println("Stock: " + product.stockQuantity);
        System.out.printf("Inventory value: $%.2f%n", product.calculateInventoryValue());
        System.out.println("Stock status: " + product.classifyStock());
        System.out.println("Inventory status: " + product.classifyInventory());

    }
}