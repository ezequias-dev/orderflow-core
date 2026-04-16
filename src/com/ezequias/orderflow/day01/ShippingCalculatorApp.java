package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class ShippingCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        if (price <= 0) {
            System.out.println("Invalid price.");
            scanner.close();
            return;
        }

        double shippingCost = 0.0;

        if (price < 70) {
            shippingCost = 50.0;
        }

        double finalTotal = price + shippingCost;

        System.out.println();
        System.out.println("SHIPPING SUMMARY");
        System.out.printf("Product price: $%.2f%n", price);
        System.out.printf("Shipping cost: $%.2f%n", shippingCost);
        System.out.printf("Final total: $%.2f%n", finalTotal);

        scanner.close();
    }
}