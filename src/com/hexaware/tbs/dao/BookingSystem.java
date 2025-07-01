package com.hexaware.tbs.dao;

import com.hexaware.tbs.bean.Event;

public abstract class BookingSystem {
    public abstract Event create_event(String event_name, String date, String time, int total_seats,
                                       double ticket_price, String event_type, String venue_name);
    public abstract double book_tickets(Event event, int num_tickets);
    public abstract boolean cancel_tickets(Event event, int num_tickets);
    public abstract int get_available_seats(Event event);
    public abstract void display_event_details(Event event);
}


