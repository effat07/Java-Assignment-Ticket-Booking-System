package com.hexaware.tbs.assignment;
import java.util.*;

public class Task3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nType 'Exit' to quit or continue booking...");
            System.out.print("Enter ticket category (Silver/Gold/Diamond): ");
            String category = sc.nextLine();

            if (category.equalsIgnoreCase("Exit")) {
                break;
            }

            double price = 0;
            if (category.equalsIgnoreCase("Silver")) price = 100;
            else if (category.equalsIgnoreCase("Gold")) price = 200;
            else if (category.equalsIgnoreCase("Diamond")) price = 300;
            else {
                System.out.println("Invalid category.");
                continue;
            }

            System.out.print("Enter number of tickets: ");
            int count = Integer.parseInt(sc.nextLine());

            double total = price * count;
            System.out.println("Total cost: ₹" + total);
        }

        sc.close();
    }
}	
