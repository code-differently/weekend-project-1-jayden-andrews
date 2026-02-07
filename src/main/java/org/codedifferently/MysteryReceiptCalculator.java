package org.codedifferently;

public class MysteryReceiptCalculator {
    // Calculates the sum of the three prices given as arguments.
    public static double calculateSubtotal(double price1, double price2, double price3) {
        return price1 + price2 + price3;
    }

    // Calculates the final price with the tax rate and discount rate applied.
    public static double calculateFinalTotal(double subtotal, double tax, double discount) {
        double finalTotal = Math.ceil((subtotal + (subtotal * tax)) * 100) / 100;
        finalTotal = Math.ceil((finalTotal - (finalTotal * discount)) * 100) / 100;
        return finalTotal;
    }
}
