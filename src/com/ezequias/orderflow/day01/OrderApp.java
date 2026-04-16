package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = input.nextLine();

        System.out.print("Enter price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = unitPrice * quantity;

        System.out.println();
        System.out.println("Product name: " + productName);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Subtotal: %.2f%n", subtotal);

        input.close();
    }
}