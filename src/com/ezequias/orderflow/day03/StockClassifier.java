package com.ezequias.orderflow.day03;

import java.util.Scanner;

public class StockClassifier {
    static String classifyStock(int stockQuantity) {
        if (stockQuantity == 0) {
            return "Out of stock";
        } else if (stockQuantity > 0 && stockQuantity < 5) {
            return "Low stock";
        } else if (stockQuantity >= 5 && stockQuantity <= 20) {
            return "Normal stock";
        } else {
            return "High stock";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Stock quantity: ");
        int stockQuantity = scanner.nextInt();

        System.out.println();

        if (stockQuantity < 0) {
            System.out.println("Invalid stock quantity.");
        } else {
            String stockStatus = classifyStock(stockQuantity);

            System.out.println("Stock status: " + stockStatus);
        }

        scanner.close();
    }
}