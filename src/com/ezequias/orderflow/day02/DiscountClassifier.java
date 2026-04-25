package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class DiscountClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        System.out.println("----------");

        if (productPrice <= 0) {
            System.out.println("Invalid product price.");
        } else if (discountPercentage < 0 || discountPercentage > 80) {
            System.out.println("Invalid discount percentage.");
        } else {
            double discountValue = productPrice * discountPercentage / 100;
            double finalPrice = productPrice - discountValue;

            String discountStatus;

            if (discountPercentage == 0) {
                discountStatus = "No discount.";
            } else if (discountPercentage <= 10) {
                discountStatus = "Small discount.";
            } else if (discountPercentage <= 30) {
                discountStatus = "Medium discount.";
            } else {
                discountStatus = "Large discount.";
            }

            System.out.printf("Original price: $%.2f%n", productPrice);
            System.out.printf("Discount value: $%.2f%n", discountValue);
            System.out.printf("Final price: $%.2f%n", finalPrice);
            System.out.println("Discount status: " + discountStatus);
        }

        scanner.close();
    }
}