package com.ezequias.orderflow.day01;

public class BasicOrderCalculator {
    public static void main(String[] args) {
        String productName = "Keyboard";
        double price = 120.50;
        int quantity = 2;
        double subtotal = price * quantity;

        System.out.println("Product name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit price: %.2f%n", price);
        System.out.printf("Subtotal: %.2f%n", subtotal);
    }
}