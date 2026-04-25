package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class OrderFlowDay02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entradas
        System.out.print("Product name: ");
        String productName = scanner.nextLine().trim();

        System.out.print("Product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println("---------------");

        // Validações
        if (productName.isBlank()) {
            System.out.println("Invalid product name.");
        } else if (productPrice <= 0) {
            System.out.println("Invalid product price.");
        } else if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            // Cálculos
            double inventoryValue = productPrice * stockQuantity;

            // Classificação de estoque
            String stockStatus;

            if (stockQuantity == 0) {
                stockStatus = "Out of stock.";
            } else if (stockQuantity < 5) {
                stockStatus = "Low stock.";
            } else if (stockQuantity <= 20) {
                stockStatus = "Normal stock.";
            } else {
                stockStatus = "High stock.";
            }

            // Classificação de valor em estoque
            String inventoryStatus;

            if (inventoryValue < 100) {
                inventoryStatus = "Small inventory.";
            } else if (inventoryValue <= 1000) {
                inventoryStatus = "Medium inventory.";
            } else {
                inventoryStatus = "Large inventory.";
            }

            // Saídas
            System.out.println("Product registered successfully.");
            System.out.println("Name: " + productName);
            System.out.printf("Price: $%.2f%n", productPrice);
            System.out.println("Stock: " + stockQuantity);
            System.out.printf("Inventory value: $%.2f%n", inventoryValue);
            System.out.println("Stock status: " + stockStatus);
            System.out.println("Inventory status: " + inventoryStatus);
        }

        scanner.close();
    }
}