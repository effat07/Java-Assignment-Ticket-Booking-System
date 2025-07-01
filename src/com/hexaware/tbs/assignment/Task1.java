package com.hexaware.tbs.assignment;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available tickets: ");
        int availableTickets = sc.nextInt();

        System.out.print("Enter number of tickets to book: ");
        int noOfBookingTicket = sc.nextInt();

        if (availableTickets >= noOfBookingTicket) {
            int remainingTickets = availableTickets - noOfBookingTicket;
            System.out.println("Booking successful! Remaining tickets: " + remainingTickets);
        } else {
            System.out.println("Tickets unavailable.");
        }
   }
}
