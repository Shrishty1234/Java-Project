package com.java.homework;

import java.util.Scanner;

public class CoffeeShopOrder {
         //Price of Coffee
        private static final double ESPRESSO_PRICE = 2.50;
        private static final double LATTE_PRICE = 3.50;
        private static final double CAPPUCCINO_PRICE = 4.00;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            int quantity;
            double totalCost = 0.0;

            System.out.println("Welcome to the Coffee Shop!");
            System.out.println("Please select a drink from the menu:");
            System.out.println("1. Espresso - $" + ESPRESSO_PRICE);
            System.out.println("2. Latte - $" + LATTE_PRICE);
            System.out.println("3. Cappuccino - $" + CAPPUCCINO_PRICE);
            System.out.println("4. Exit");

            while (true) {
                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();

                if (choice == 4) {
                    System.out.println("Thank you for visiting!");
                    break;
                }

                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice, please try again.");
                    continue;
                }

                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();

                switch (choice) {
                    case 1:
                        totalCost += quantity * ESPRESSO_PRICE;
                        System.out.println("Added " + quantity + " Espresso(s) to your order.");
                        break;
                    case 2:
                        totalCost += quantity * LATTE_PRICE;
                        System.out.println("Added " + quantity + " Latte(s) to your order.");
                        break;
                    case 3:
                        totalCost += quantity * CAPPUCCINO_PRICE;
                        System.out.println("Added " + quantity + " Cappuccino(s) to your order.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }

                System.out.println("Current total: $" + String.format("%.2f", totalCost));
            }

            System.out.println("Your final total is: $" + String.format("%.2f", totalCost));
            scanner.close();
        }
    }














