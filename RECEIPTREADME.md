# 🧾 Mystery Receipt Generator

## Overview

This Java program that generates **Mystery receipt** based on user input and randomly generated values.  
It will then compare
the user's budget to the subtotal of the items on the receipt and inform the user of whether their transaction was **successful** or **not**.

Each time the program runs, the receipt is **slightly different**.

---

## How it works

The program takes input for the user's:
  * name
  * budget
  * A discount code.

A receipt is then generated containing:
  
  * The name of the store
  * A receipt code
  * 3 item prices
  * Subtotal
  * Price adjustments containing any price modifiers, such as tax and discount if applicable
  * The final total
---
Sample Input & Output
----------------------------------------------------------------
Name: Jayden  
Budget: 200.00  
Discount: employee  

Jayden's Emporium  
ID Code: 191591  
Receipt Code: JAY-191591  
Item 1: \$72.65  
Item 2: \$103.84  
Item 3: \$121.23  
Subtotal: \$297.72  

---Price Adjustments---  
Sales tax: 6%

Checking for coupon code...  
Coupon code "employee" accepted!  
Discount: 30%  

Final Total: $220.92  

Transaction failed!  
Insufficient Funds. User is short by $20.92 dollars...  
Cancelling transaction.  
---
## Java Concepts Used
The following Java concepts are used in this project:

* Use of Variables
* Creation of objects
* Organization of multiple classes and methods within them
* Collecting user input using `Scanner`
* Generating random values using the `Random` class
* The `Math` class and its functions
* Manipulating and validating text using the `String` class
* (`if / else`) Conditionals