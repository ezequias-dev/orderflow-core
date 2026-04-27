package com.ezequias.orderflow.day04;

public class MultipleProductsTest {
    static void printProduct(Product product) {
        System.out.println("Name: " + product.name);
        System.out.printf("Price: $%.2f%n", product.price);
        System.out.println("Stock: " + product.stockQuantity);
        System.out.printf("Inventory value: $%.2f%n", product.calculateInventoryValue());
        System.out.println("Stock status: " + product.classifyStock());
        System.out.println("Inventory status: " + product.classifyInventory());
    }

    public static void main(String[] args) {
        Product mouse = new Product("Mouse", 50.0, 10);
        Product keyboard = new Product("Keyboard", 150.0, 3);
        Product monitor = new Product("Monitor", 900.0, 2);

        printProduct(mouse);
        System.out.println("---------------");
        printProduct(keyboard);
        System.out.println("---------------");
        printProduct(monitor);
    }
}