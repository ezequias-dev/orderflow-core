package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class OrderFlowDay01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine().trim();

        System.out.print("Product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println();

        if (productName.isBlank()) {
            System.out.println("Invalid name.");
        } else if (productPrice <= 0) {
            System.out.println("Invalid price.");
        } else if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            double inventoryValue = productPrice * stockQuantity;

            System.out.println("Product registered successfully.");
            System.out.println("Name: " + productName);
            System.out.printf("Price: $%.2f%n", productPrice);
            System.out.println("Stock: " + stockQuantity);
            System.out.printf("Inventory value: $%.2f%n", inventoryValue);
        }

        scanner.close();
    }
}