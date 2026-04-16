package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class StockValueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter stock quantity: ");
        int stockQuantity = scanner.nextInt();

        double totalStockValue = price * stockQuantity;

        System.out.println();
        System.out.println("STOCK SUMMARY");
        System.out.println("Product name: " + productName);
        System.out.printf("Unit price: $%.2f%n", price);
        System.out.println("Stock quantity: " + stockQuantity);
        System.out.printf("Total value stock: $%.2f%n", totalStockValue);

        scanner.close();
    }
}