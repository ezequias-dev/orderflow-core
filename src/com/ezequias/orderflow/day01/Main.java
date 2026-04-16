package com.ezequias.orderflow.day01;

public class Main {
    public static void main(String[] args) {
        System.out.println(3 / 2);

        int quantity = 3;
        double price = 10.0;
        double total = quantity * price;
        System.out.println(total);

        double payment = 99.99;
        int finalValue = (int) payment;
        System.out.println(finalValue);

        String productName = "Notebook";
        int stock = 5;
        System.out.println(productName + " - " + stock);

        int a = 10;
        int b = 3;
        System.out.println(a / b);
        System.out.println((double) a / b);
    }
}