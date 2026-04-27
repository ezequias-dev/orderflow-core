package com.ezequias.orderflow.day04;

public class Product {
    String name;
    double price;
    int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    double calculateInventoryValue() {
        return price * stockQuantity;
    }

    String classifyStock() {
        if (stockQuantity == 0) {
            return "Out of stock";
        } else if (stockQuantity > 0 && stockQuantity < 5) {
            return "Low stock";
        } else if (stockQuantity >= 5 && stockQuantity <= 20) {
            return "Normal stock";
        } else {
            return "High stock";
        }
    }

    String classifyInventory() {
        double inventoryValue = calculateInventoryValue();

        if (inventoryValue < 100) {
            return "Small inventory";
        } else if (inventoryValue <= 1000) {
            return "Medium inventory";
        } else {
            return "Large inventory";
        }
    }
}