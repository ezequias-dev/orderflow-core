package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class OrderInputApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double subtotal = price * quantity;

        System.out.println("\n=== PRODUCT SUMMARY ===");
        System.out.println("Product name: " + productName);
        System.out.printf("Product price: %.2f%n", price);
        System.out.println("Product quantity: " + quantity);
        System.out.printf("Subtotal: %.2f%n", subtotal);

        scanner.close();
    }
}