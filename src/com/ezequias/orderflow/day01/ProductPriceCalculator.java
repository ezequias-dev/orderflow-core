package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        System.out.println("----------");

        if (productName.isBlank()) {
            System.out.println("Invalid product name.");
        } else if (productPrice <= 0) {
            System.out.println("Invalid price.");
        } else if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount.");
        } else {
            double discountValue = productPrice * discountPercentage / 100;
            double finalPrice = productPrice - discountValue;

            System.out.println("Product name: " + productName);
            System.out.printf("Product price: $%.2f%n", productPrice);
            System.out.printf("Discount percentage: %.2f%%%n", discountPercentage);
            System.out.printf("Discount value: $%.2f%n", discountValue);
            System.out.printf("Final price: $%.2f%n", finalPrice);
        }

        scanner.close();
    }
}