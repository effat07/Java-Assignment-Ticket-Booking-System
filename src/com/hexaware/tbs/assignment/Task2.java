package com.hexaware.tbs.assignment;

import java.util.*;

public class Task2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0;

        System.out.println("Ticket Categories: Silver, Gold, Diamond");
        System.out.print("Enter ticket category: ");
        String category = sc.nextLine();

        System.out.print("Enter number of tickets: ");
        int quantity = sc.nextInt();

        if (category.equalsIgnoreCase("Silver")) {
            price = 100;
        } else if (category.equalsIgnoreCase("Gold")) {
            price = 200;
        } else if (category.equalsIgnoreCase("Diamond")) {
            price = 300;
        } else {
            System.out.println("Invalid ticket category.");
           
            return;
        }

        double total = price * quantity;
        System.out.println("Total cost: ₹" + total);

        
    }
}
