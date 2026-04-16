package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class PaymentChangeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase value: ");
        double purchaseValue = scanner.nextDouble();

        System.out.print("Enter amount paid: ");
        double amountPaid = scanner.nextDouble();

        System.out.println();

        if (amountPaid >= purchaseValue) {
            double change = amountPaid - purchaseValue;
            System.out.printf("Change: $%.2f%n", change);
            System.out.println("Sufficient payment");
        } else {
            double missingAmount = purchaseValue - amountPaid;
            System.out.printf("Missing amount: $%.2f%n", missingAmount);
            System.out.println("Insufficient payment");
        }

        scanner.close();
    }
}