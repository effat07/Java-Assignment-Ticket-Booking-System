package com.hexaware.tbs.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Event {
    protected String event_name;
    protected LocalDate event_date;
    protected LocalTime event_time;
    protected Venue venue;
    protected int total_seats;
    protected int available_seats;
    protected double ticket_price;
    protected String event_type;

    public static int event_counter = 0;
    protected int event_id;

    public Event(String event_name, LocalDate event_date, LocalTime event_time,
                 Venue venue, int total_seats, double ticket_price, String event_type) {
        this.event_name = event_name;
        this.event_date = event_date;
        this.event_time = event_time;
        this.venue = venue;
        this.total_seats = total_seats;
        this.available_seats = total_seats;
        this.ticket_price = ticket_price;
        this.event_type = event_type;
        this.event_id = ++event_counter;
    }

    public abstract void display_event_details();

    public int getEvent_id() { 
    	return event_id; 
    	}
    public int getAvailable_seats() {
    	return available_seats; 
    	}
    public boolean book_tickets(int num) { 
    	if (available_seats >= num) {
    		available_seats -= num; return true;
    		}
    	return false; 
    	}
    public boolean cancel_booking(int num) { 
    	if (getBookedNoOfTickets() >= num) { 
    		available_seats += num; 
    		return true;
    		}
    	return false; 
    	}
    public int getBookedNoOfTickets() { 
    	return total_seats - available_seats; 
    	}
    public double getTicket_price() { 
    	return ticket_price;
    	}
    public String getEvent_name() {
    	return event_name; 
    	}
}