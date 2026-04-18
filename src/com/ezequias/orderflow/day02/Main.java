package com.ezequias.orderflow.day02;

public class Main {
    public static void main(String[] args) {
        int age = 19;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        double price = -10.0;

        if (price < 0) {
            System.out.println("Invalid price");
        } else {
            System.out.println("Valid price");
        }

        String email = "test@email.com";

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        int quantity = 12;

        if (quantity >= 20) {
            System.out.println("Big order");
        } else if (quantity >= 10) {
            System.out.println("Medium order");
        } else {
            System.out.println("Small order");
        }
    }
}