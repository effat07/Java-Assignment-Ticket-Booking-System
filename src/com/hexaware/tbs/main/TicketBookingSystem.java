package com.hexaware.tbs.main;

import java.util.Scanner;

import com.hexaware.tbs.bean.Customer;
import com.hexaware.tbs.bean.Venue;
import com.hexaware.tbs.exception.EventNotFoundException;
import com.hexaware.tbs.exception.InvalidBookingIDException;
import com.hexaware.tbs.service.BookingSystemServiceProviderImpl;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookingSystemServiceProviderImpl service = new BookingSystemServiceProviderImpl();
        Venue venue = new Venue("Main Hall", "123 Street");

        while (true) {
            System.out.println("\nChoose From Following Options");
            System.out.println("\n 1. Create Event \n 2. Book Tickets \n 3. Cancel Tickets  \n 4. Get Event Details  \n 5. Get Available Seats \n 6. Exit \n");
            String options = sc.nextLine();

            switch (options) {
                case "1":
                    System.out.print("Enter Name of Event: ");
                    String event_name = sc.nextLine();
                    System.out.print("Enter date(YYYY-MM-DD):" );
                    String date = sc.nextLine();
                    System.out.print("time(HH:MM):");
                    String time = sc.nextLine();
                    System.out.print("total seats: ");
                    int seats = Integer.parseInt(sc.nextLine());
                    System.out.print("Ticket price:" );
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Event Type:");
                    String event_type = sc.nextLine();
                    service.create_event(event_name, date, time, seats, price, event_type, venue);
                    break;

                case "2" :
                    try {
                        System.out.print("Enter Event name: " );
                        event_name = sc.nextLine();
                        System.out.print("Number of Tickets:");
                        int num_tickets = Integer.parseInt(sc.nextLine());
                        Customer[] customers = new Customer[num_tickets];
                        for (int i = 0; i < num_tickets; i++) {
                            customers[i] = new Customer("Customer " + i, "email" + i, "9999999999");
                        }
                        double cost = service.book_tickets(event_name, num_tickets, customers);
                        if (cost > 0) System.out.println("Total cost: " + cost);
                    } catch (EventNotFoundException e) {
                        System.out.println(e.getMessage());
                    } catch (NullPointerException e) {
                        System.out.println("Something went wrong: " + e.getMessage());
                    }
                    break;

                case "3":
                    try {
                        System.out.println("Enter Booking Id to cancel:");
                        int id = Integer.parseInt(sc.nextLine());
                        service.cancel_booking(id);
                        System.out.println("Booking cancelled successfully.");
                    } catch (InvalidBookingIDException e) {
                        System.out.println(e.getMessage());
                    } catch (NullPointerException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "4":
                    service.getEventDetails();
                    for (com.hexaware.tbs.bean.Event e : service.getEventDetails()) e.display_event_details();
                    break;

                case "5":
                    for (com.hexaware.tbs.bean.Event e : service.getEventDetails()) {
                        System.out.println(e.getEvent_name() + " seats left: " + e.getAvailable_seats());
                    }
                    break;
                    

                case "6":
                    sc.close();
                    System.out.println("Exiting.");
                    return;

                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}