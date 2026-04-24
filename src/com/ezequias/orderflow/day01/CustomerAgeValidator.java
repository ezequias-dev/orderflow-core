package com.ezequias.orderflow.day01;

import java.util.Scanner;

public class CustomerAgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer name: ");
        String name = scanner.nextLine();

        System.out.print("Customer age: ");
        int age = scanner.nextInt();

        System.out.println("----------");

        if (name.isBlank()) {
            System.out.println("Invalid name.");
        } else if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("Customer is underage.");
        } else {
            System.out.println("Customer is allowed.");
        }

        scanner.close();
    }
}