package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class UserRegistrationValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        boolean validRegistration = true;

        System.out.println();

        if (name.trim().isEmpty()) {
            System.out.println("Invalid name");
            validRegistration = false;
        }

        if (age < 18) {
            System.out.println("Underage user");
            validRegistration = false;
        }

        if (!email.contains("@")) {
            System.out.println("Invalid email");
            validRegistration = false;
        }

        if (salary < 0) {
            System.out.println("Invalid salary");
            validRegistration = false;
        }

        if (validRegistration) {
            System.out.println("User registration approved");
        }

        scanner.close();
    }
}