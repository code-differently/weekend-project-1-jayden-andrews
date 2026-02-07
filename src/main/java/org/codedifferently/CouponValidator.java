package org.codedifferently;

import java.util.Random;

public class CouponValidator {
    public static double validateCoupon(String coupon, Random random) {
        System.out.println("\nChecking for coupon code...");
        if ((coupon).equalsIgnoreCase("friend")) {
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!");
            return 0.15;
        } else if ((coupon).equalsIgnoreCase("employee")) {
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!");
            return 0.30;
        } else if (coupon.equalsIgnoreCase("chance")) {
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!\nWelcome to Chance Time!\nRolling the dice (1-6)...");
            int diceRoll = (random.nextInt(1, 7));
            System.out.println("Rolled " + diceRoll + ".");
            if (diceRoll % 2 == 0) {
                System.out.println("YOU'VE GOTTEN LUCKY!!!");
                return 0.40;
            } else {
                System.out.println("Better luck next time...");
                return -0.05;
            }
        } else {
            System.out.println("Coupon code " + "\"" + coupon + "\" not found!");
            return 0.0;
        }
    }
}
