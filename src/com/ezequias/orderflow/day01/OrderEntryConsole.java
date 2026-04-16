package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class OrderEntryConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double subtotal = unitPrice * quantity;
        boolean largeOrder = quantity >= 10;

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.println("Large order: " + largeOrder);

        scanner.close();
    }
}