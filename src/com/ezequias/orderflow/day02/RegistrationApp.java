package com.ezequias.orderflow.day02;

import java.util.Scanner;

public class RegistrationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println();
        boolean register = true;

        if (name.trim().isEmpty()) {
            System.out.println("Invalid name");
            register = false;
        }

        if (age < 0) {
            System.out.println("Invalid age");
            register = false;
        } else if (age < 18) {
            System.out.println("Underage user");
            register = false;
        }

        if (register) {
            System.out.println("Registration approved");
        } else {
            System.out.println("Registration rejected");
        }

        scanner.close();
    }
}