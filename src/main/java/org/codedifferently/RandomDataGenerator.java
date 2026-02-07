package org.codedifferently;
import java.util.Random;

public class RandomDataGenerator {
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
        return ((double) (Math.round(random.nextDouble(1.5, 7.5))) / 100);
    }
}
