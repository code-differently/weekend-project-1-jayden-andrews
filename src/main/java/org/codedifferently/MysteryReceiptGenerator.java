package org.codedifferently;
import java.util.*;

class MysteryReceiptGenerator {
    static String name = "Jayden's Emporium";

    public static double validateCoupon(String coupon) {
        System.out.println("\nChecking for coupon code...");
        if ((coupon).equalsIgnoreCase("friend")) {
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!");
            return 0.15;
        } else if ((coupon).equalsIgnoreCase("employee")) {
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!");
            return 0.30;
        } else {
            System.out.println("Coupon code " + "\"" + coupon + "\" not found!");
            return 0.0;
        }
    }

    public static String generateReceiptCode(String name, int visitorID) {
        return (name.substring(0, 3)).toUpperCase() + "-" + visitorID;
    }

    public static int generateVisitorID(Random random) {
        return random.nextInt(1000, 1000000);
    }

    public static double generatePrice(Random random) {
        return ((double) random.nextInt(1000, 20000) / 100);
    }

    public static double generateTax(Random random) {
        return ((Math.floor(random.nextDouble(2, 7))) / 100);
    }

    public static double calculateSubtotal(double price1, double price2, double price3) {
        return price1 + price2 + price3;
    }

    public static double calculateFinalTotal(double subtotal, double tax, double discount) {
        double finalTotal = Math.ceil((subtotal + (subtotal * tax)) * 100) / 100;
        finalTotal = Math.ceil((finalTotal - (finalTotal * discount)) * 100) / 100;
        return finalTotal;
    }

    public static void printReceipt(String name, double budget, String coupon) {
        /*
        Store name
        Visitor ID
        Receipt Code
        Item Prices
        Subtotal
        Tax
        Discounts
        Final Total
         */
        Random random = new Random();
        int visitorID = MysteryReceiptGenerator.generateVisitorID(random);
        String receiptCode = MysteryReceiptGenerator.generateReceiptCode(name, visitorID);
        double price1 = MysteryReceiptGenerator.generatePrice(random);
        double price2 = MysteryReceiptGenerator.generatePrice(random);
        double price3 = MysteryReceiptGenerator.generatePrice(random);
        double tax = MysteryReceiptGenerator.generateTax(random);
        double subtotal = MysteryReceiptGenerator.calculateSubtotal(price1, price2, price3);



        // Prints the receipt to the console
        System.out.println("\n" +MysteryReceiptGenerator.name);
        System.out.println("----------------------------------------------------------------");
        System.out.println("ID Code: " + visitorID);
        System.out.println("Receipt Code: " + receiptCode);
        System.out.printf("Item 1: $%.2f%n", price1);
        System.out.printf("Item 2: $%.2f%n", price2);
        System.out.printf("Item 3: $%.2f%n", price3);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.println("\n---Price Adjustments---");
        System.out.println("Sales tax: " + ((int)(tax * 100)) + "%");
        double discount = MysteryReceiptGenerator.validateCoupon(coupon);
        double finalTotal = MysteryReceiptGenerator.calculateFinalTotal(subtotal, tax, discount);
        if (discount != 0.0) {
            System.out.println("Discount: " + (int)(discount * 100) + "%");
        }
        System.out.printf("\nFinal Total: $%.2f%n", finalTotal);

        if (finalTotal > budget) {
            System.out.printf("\nTransaction failed!\nInsufficient Funds. User is short by $%.2f dollars...\nCancelling transaction.", Math.abs(budget - finalTotal));
        } else {

            System.out.println("\nTransaction succeeded!\nThank you for shopping at Jayden's Emporium!");
        }

    }
}