package org.codedifferently;
import java.util.*;

class MysteryReceiptPrinter {
    static String storeName = "Jayden's Emporium";

    // Prints the receipt out to the console.
    public static void printReceipt(String name, double budget, String coupon) {
        // Creates a random object that will be used for any random elements.
        Random random = new Random();

        // Stores a random visitor ID in a variable.
        int visitorID = RandomDataGenerator.generateVisitorID(random);

        // Stores a random receipt code in a variable.
        String receiptCode = RandomDataGenerator.generateReceiptCode(name, visitorID);

        // Stores three random prices in three different variables.
        double price1 = RandomDataGenerator.generatePrice(random);
        double price2 = RandomDataGenerator.generatePrice(random);
        double price3 = RandomDataGenerator.generatePrice(random);

        // Stores a random tax rate in a variable.
        double tax = RandomDataGenerator.generateTax(random);

        // Stores the subtotal in a variable.
        double subtotal = MysteryReceiptCalculator.calculateSubtotal(price1, price2, price3);

        // Prints the receipt to the console
        System.out.println("\n" + MysteryReceiptPrinter.storeName);
        System.out.println("----------------------------------------------------------------");
        System.out.println("ID Code: " + visitorID);
        System.out.println("Receipt Code: " + receiptCode);
        System.out.printf("Item 1: $%.2f%n", price1);
        System.out.printf("Item 2: $%.2f%n", price2);
        System.out.printf("Item 3: $%.2f%n", price3);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.println("\n---Price Adjustments---");
        System.out.println("Sales tax: " + ((int)(tax * 100)) + "%");

        // Stores the discount rate in a variable.
        double discount = CouponValidator.validateCoupon(coupon, random);

        // Stores the final total in a variable.
        double finalTotal = MysteryReceiptCalculator.calculateFinalTotal(subtotal, tax, discount);

        // Prints the discount only if one exists.
        if (discount != 0.0) {
            System.out.println("Discount: " + (int)(discount * 100) + "%");
        }
        System.out.printf("\nFinal Total: $%.2f%n", finalTotal);

        // Checks to see if the user has enough money to complete the transaction.
        if (finalTotal > budget) {
            System.out.printf("\nTransaction failed!\nInsufficient Funds. User is short by $%.2f dollars...\nCancelling transaction.", Math.abs(budget - finalTotal));
        } else {
            System.out.println("\nTransaction succeeded!\nThank you for shopping at Jayden's Emporium!");
        }
    }
}