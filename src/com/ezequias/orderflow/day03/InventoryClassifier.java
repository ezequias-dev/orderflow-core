package com.ezequias.orderflow.day03;

import java.util.Scanner;

public class InventoryClassifier {
    static double calculateInventoryValue(double price, int quantity) {
        return price * quantity;
    }

    static String classifyInventory(double inventoryValue) {
        if (inventoryValue < 100) {
            return "Small inventory";
        } else if (inventoryValue <= 1000) {
            return "Medium inventory";
        } else {
            return "Large inventory";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("---------");

        if (price <= 0) {
            System.out.println("Invalid price.");
        } else if (quantity < 0) {
            System.out.println("Invalid quantity.");
        } else {
            double inventoryValue = calculateInventoryValue(price, quantity);
            String inventoryStatus = classifyInventory(inventoryValue);

            System.out.printf("Inventory value: $%.2f%n", inventoryValue);
            System.out.println("Inventory status: " + inventoryStatus);
        }

        scanner.close();
    }
}