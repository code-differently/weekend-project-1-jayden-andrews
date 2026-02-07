package org.codedifferently;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your budget: ");
        double budget = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter a coupon code: ");
        String coupon = sc.nextLine();

        sc.close();
        MysteryReceiptGenerator.printReceipt(name, budget, coupon);
    }
}
