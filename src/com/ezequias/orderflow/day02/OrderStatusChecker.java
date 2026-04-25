package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class OrderStatusChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Order value: ");
        double orderValue = scanner.nextDouble();

        System.out.print("Payment approved (true/false): ");
        boolean paymentApproved = scanner.nextBoolean();

        System.out.println("---------------");

        if (orderValue <= 0) {
            System.out.println("Invalid order value.");
        } else {
            String orderStatus;

            if (!paymentApproved) {
                orderStatus = "Waiting payment.";
            } else if (orderValue < 100) {
                orderStatus = "Paid order.";
            } else {
                orderStatus = "Paid priority order.";
            }

            System.out.println("Status: " + orderStatus);
        }

        scanner.close();
    }
}