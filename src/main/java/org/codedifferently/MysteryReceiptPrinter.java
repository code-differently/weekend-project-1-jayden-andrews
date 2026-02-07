package org.codedifferently;
import java.util.*;

class MysteryReceiptPrinter {
    static String storeName = "Jayden's Emporium";

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
        int visitorID = RandomDataGenerator.generateVisitorID(random);
        String receiptCode = RandomDataGenerator.generateReceiptCode(name, visitorID);
        double price1 = RandomDataGenerator.generatePrice(random);
        double price2 = RandomDataGenerator.generatePrice(random);
        double price3 = RandomDataGenerator.generatePrice(random);
        double tax = RandomDataGenerator.generateTax(random);
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
        double discount = CouponValidator.validateCoupon(coupon, random);
        double finalTotal = MysteryReceiptCalculator.calculateFinalTotal(subtotal, tax, discount);
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