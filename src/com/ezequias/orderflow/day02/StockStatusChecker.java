package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class StockStatusChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine().trim();

        System.out.print("Stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println();

        if (productName.isEmpty()) {
            System.out.println("Invalid product name.");
        } else if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            String status;

            if (stockQuantity == 0) {
                status = "Out of stock.";
            } else if (stockQuantity < 5) {
                status = "Low stock.";
            } else if (stockQuantity <= 20) {
                status = "Normal stock.";
            } else {
                status = "High stock.";
            }

            System.out.println("Product: " + productName);
            System.out.println("Stock quantity: " + stockQuantity);
            System.out.println("Status: " + status);
        }

        scanner.close();
    }
}