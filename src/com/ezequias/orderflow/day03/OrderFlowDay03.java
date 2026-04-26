package com.ezequias.orderflow.day03;

import java.util.Scanner;

public class OrderFlowDay03 {
    static boolean isInvalidProductName(String productName) {
        return productName.isBlank();
    }

    static boolean isInvalidProductPrice(double productPrice) {
        return productPrice <= 0;
    }

    static boolean isInvalidStockQuantity(int stockQuantity) {
        return stockQuantity < 0;
    }

    static double calculateInventoryValue(double productPrice, int stockQuantity) {
        return productPrice * stockQuantity;
    }

    static String classifyStock(int stockQuantity) {
        if (stockQuantity == 0) {
            return "Out of stock.";
        } else if (stockQuantity > 0 && stockQuantity < 5) {
            return "Low stock.";
        } else if (stockQuantity >= 5 && stockQuantity <= 20) {
            return "Normal stock.";
        } else {
            return "High stock.";
        }
    }

    static String classifyInventory(double inventoryValue) {
        if (inventoryValue < 100) {
            return "Small inventory.";
        } else if (inventoryValue <= 1000) {
            return "Medium inventory.";
        } else {
            return "Large inventory.";
        }
    }

    static void printProductSummary(
        String productName,
        double productPrice,
        int stockQuantity,
        double inventoryValue,
        String stockStatus,
        String inventoryStatus
    ) {
        System.out.println("Product registered successfully.");
        System.out.println("Name: " + productName);
        System.out.printf("Price: $%.2f%n", productPrice);
        System.out.println("Stock: " + stockQuantity);
        System.out.printf("Inventory value: $%.2f%n", inventoryValue);
        System.out.println("Stock status: " + stockStatus);
        System.out.println("Inventory status: " + inventoryStatus);
    }

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
        boolean invalidProductName = isInvalidProductName(productName);
        boolean invalidProductPrice = isInvalidProductPrice(productPrice);
        boolean invalidStockQuantity = isInvalidStockQuantity(stockQuantity);

        if (invalidProductName) {
            System.out.println("Invalid product name.");
        } else if (invalidProductPrice) {
            System.out.println("Invalid product price.");
        } else if (invalidStockQuantity) {
            System.out.println("Invalid stock quantity.");
        } else {
            // Cálculo
            double inventoryValue = calculateInventoryValue(productPrice, stockQuantity);

            // Classificação de estoque
            String stockStatus = classifyStock(stockQuantity);

            // Classificação de valor em estoque
            String inventoryStatus = classifyInventory(inventoryValue);

            // Saídas
            printProductSummary(productName, productPrice, stockQuantity, inventoryValue, stockStatus, inventoryStatus);
        }

        scanner.close();
    }
}