package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class FreightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Order value: ");
        double orderValue = scanner.nextDouble();

        System.out.print("Distance in km: ");
        double distance = scanner.nextDouble();

        System.out.println("---------------");

        if (orderValue <= 0) {
            System.out.println("Invalid order value.");
        } else if (distance <= 0) {
            System.out.println("Invalid distance.");
        } else {

            double freight;

            if (distance <= 10) {
                freight = 5;
            } else if (distance <= 50) {
                freight = 15;
            } else {
                freight = 30;
            }

            double finalTotal = orderValue + freight;

            System.out.printf("Order value: $%.2f%n", orderValue);
            System.out.printf("Distance: %.2f km%n", distance);
            System.out.printf("Freight: $%.2f%n", freight);
            System.out.printf("Final total: $%.2f%n", finalTotal);
        }

        scanner.close();
    }
}