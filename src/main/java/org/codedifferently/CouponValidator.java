package org.codedifferently;

import java.util.Random;

public class CouponValidator {
    // Checks the coupon code to see if a discount should be applied.
    public static double validateCoupon(String coupon, Random random) {
        System.out.println("\nChecking for coupon code...");
        if ((coupon).equalsIgnoreCase("friend")) {
            // Applies a 15% discount if the "friend" coupon code is used.
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!");
            return 0.15;
        } else if ((coupon).equalsIgnoreCase("employee")) {
            // Applies a 30% discount if the coupon code "employee" is used.
            System.out.println("Coupon code " + "\"" + coupon + "\" accepted!");
            return 0.30;
        } else if (coupon.equalsIgnoreCase("chance")) {
            /* Starts "chance time" which will roll a die. If the result is even,
            a 40% discount will be applied. If it is odd, all items will become 5%
            more expensive.
             */
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
            // The coupon code provided does not exist. The discount rate will be 0%.
            System.out.println("Coupon code " + "\"" + coupon + "\" not found!");
            return 0.0;
        }
    }
}
