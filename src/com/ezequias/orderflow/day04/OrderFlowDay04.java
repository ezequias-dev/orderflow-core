package com.ezequias.orderflow.day04;

import java.util.Scanner;

class Product2 {
    String name;
    double price;
    int stockQuantity;

    public Product2(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    double calculateInventoryValue() {
        return price * stockQuantity;
    }

    String classifyStock() {
        if (stockQuantity == 0) {
            return "Out of stock";
        } else if (stockQuantity > 0 && stockQuantity < 5) {
            return "Low stock";
        } else if (stockQuantity >= 5 && stockQuantity <= 20) {
            return "Normal stock";
        } else {
            return "High stock";
        }
    }

    String classifyInventory() {
        double inventoryValue = calculateInventoryValue();

        if (inventoryValue < 100) {
            return "Small inventory";
        } else if (inventoryValue <= 1000) {
            return "Medium inventory";
        } else {
            return "Large inventory";
        }
    }

    void productSummary() {
        System.out.println("Name: " + name);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Stock: " + stockQuantity);
        System.out.printf("Inventory value: $%.2f%n", calculateInventoryValue());
        System.out.println("Stock status: " + classifyStock());
        System.out.println("Inventory status: " + classifyInventory());
    }
}

public class OrderFlowDay04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine().trim();

        System.out.print("Product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println("----------");

        if (productName.isBlank()) {
            System.out.println("Invalid product name.");
        } else if (productPrice <= 0) {
            System.out.println("Invalid product price.");
        } else if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            Product2 product = new Product2(productName, productPrice, stockQuantity);

            product.productSummary();
        }
        scanner.close();
    }
}
