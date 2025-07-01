package com.hexaware.tbs.service;

import com.hexaware.tbs.bean.Customer;
import com.hexaware.tbs.bean.Event;
import com.hexaware.tbs.bean.Venue;

public interface IEventServiceProvider {
    Event create_event(String event_name, String date, String time, int total_seats,
                       double ticket_price, String event_type, Venue venue);

    Event[] getEventDetails();

    int getAvailableNoOfTickets(Event event);

	double calculate_booking_cost(int num_tickets, Event event);

	
}
