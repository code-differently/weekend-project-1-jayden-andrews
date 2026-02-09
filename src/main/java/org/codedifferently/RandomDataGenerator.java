package org.codedifferently;
import java.util.Random;

public class RandomDataGenerator {
    // Generates a random receipt code for the user.
    public static String generateReceiptCode(String name, int visitorID) {
        return (name.substring(0, 3)).toUpperCase() + "-" + visitorID;
    }

    // Generates a random visitor ID for the user.
    public static int generateVisitorID(Random random) {
        return random.nextInt(1000, 1000000);
    }

    // Generates a random item price.
    public static double generatePrice(Random random) {
        return ((double) random.nextInt(1000, 20000) / 100);
    }

    // Generates a random sales tax rate for the store.
    public static double generateTax(Random random) {
        return ((double) (Math.round(random.nextDouble(1.5, 7.5))) / 100);
    }
}
