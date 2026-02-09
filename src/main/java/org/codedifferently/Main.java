package org.codedifferently;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Collects input for the user's name and stores it in a variable
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        // Collects input for the user's budget and stores it in a variable
        System.out.print("Enter your budget: ");
        double budget = sc.nextDouble();
        sc.nextLine();

        // Collects input for the user's coupon and stores it in a variable
        System.out.print("Enter a coupon code: ");
        String coupon = sc.nextLine().trim();

        sc.close();
        // Prints the receipt out to the console.
        MysteryReceiptPrinter.printReceipt(name, budget, coupon);
    }
}
