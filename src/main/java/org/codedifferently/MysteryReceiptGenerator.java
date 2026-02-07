package org.codedifferently;
import java.util.*;

class MysteryReceiptGenerator {
    String name = "Jayden's Emporium";

    public String validateCoupon(String coupon) {
        return "";
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
        return ((double) random.nextInt(2, 8) / 100);
    }

    public double calculateTotal() {
        return 0.0;
    }

    public static void printReceipt(String name, double amount, String coupon) {
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
        System.out.println(receiptCode);
    }
}