package com.ezequias.orderflow.day03;

import java.util.Scanner;

public class InventoryCalculator {
    static double calculateInventoryValue(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println("----------");

        if (productPrice <= 0) {
            System.out.println("Invalid product price.");
        } else if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            double inventoryValue = calculateInventoryValue(productPrice, stockQuantity);

            System.out.printf("Stock value: $%.2f%n", inventoryValue);
        }

        scanner.close();
    }
}