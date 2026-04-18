package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class OrderApprovalConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double subtotal = unitPrice * quantity;
        boolean validOrder = true;

        System.out.println();

        if (customerName.trim().isEmpty()) {
            System.out.println("Invalid customer name");
            validOrder = false;
        }

        if (productName.trim().isEmpty()) {
            System.out.println("Invalid product name");
            validOrder = false;
        }

        if (unitPrice <= 0) {
            System.out.println("Invalid price");
            validOrder = false;
        }

        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            validOrder = false;
        }

        String status;

        if (!validOrder) {
            status = "Invalid order";
        } else if (subtotal < 100) {
            status = "Minimum order amount not reached";
        } else {
            status = "Order approved";
        }

        System.out.println();
        System.out.println("ORDER ANALYSIS");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.printf("Unit price: $%.2f%n", unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.println("Status: " + status);

        scanner.close();
    }
}