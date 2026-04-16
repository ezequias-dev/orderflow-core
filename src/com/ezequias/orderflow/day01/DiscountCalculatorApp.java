package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class DiscountCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double subtotal = price * quantity;
        double discountAmount = 0.0;

        if (quantity >= 10) {
            discountAmount = subtotal * 0.10;
        }

        double total = subtotal - discountAmount;

        System.out.println("\n=== PRODUCT SUMMARY ===");
        System.out.println("Product name: " + productName);
        System.out.println("Product quantity: " + quantity);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Discount: %.2f%n", discountAmount);
        System.out.printf("Total: %.2f%n", total);

        scanner.close();
    }
}