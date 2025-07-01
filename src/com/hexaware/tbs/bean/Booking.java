package com.hexaware.tbs.bean;


import java.util.List;

public class Booking {
    public static int booking_counter = 0;
    private int booking_id;
    private Event event;
    private List<Customer> customers;
    private double total_cost;

    public Booking(Event event, List<Customer> customers, double total_cost) {
        this.booking_id = ++booking_counter;
        this.event = event;
        this.customers = customers;
        this.total_cost = total_cost;
    }

    public int getBooking_id() { 
    	return booking_id;
    	}
    public Event getEvent() {
    	return event; 
    	}
    public double getTotal_cost() { 
    	return total_cost; 
    	}

    public void display_booking_details() {
        System.out.println("\nBooking ID: " + booking_id + ", Event: " + event.getEvent_name() + ", Total cost: " + total_cost);
    }
}