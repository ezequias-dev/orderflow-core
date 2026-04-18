package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class ProductValidatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println();
        boolean validProduct = true;

        if (productName.trim().isEmpty()) {
            System.out.println("Invalid product name");
            validProduct = false;
        }

        if (price <= 0) {
            System.out.println("Invalid price");
            validProduct = false;
        }

        if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity");
            validProduct = false;
        }

        if (validProduct) {
            System.out.println("Product is valid");
        }

        scanner.close();
    }
}