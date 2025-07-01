

package com.hexaware.tbs.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.tbs.bean.*;

public class EventServiceProviderImpl implements IEventServiceProvider {
	// Made protected so BookingSystemServiceProviderImpl can access it
	protected List<Event> events = new ArrayList<>();

	@Override
	public Event create_event(String event_name, String date, String time, int total_seats,
	                          double ticket_price, String event_type, Venue venue) {

	    LocalDate d = LocalDate.parse(date);
	    LocalTime t = LocalTime.parse(time);
	    Event event = null;

	    if (event_type.equalsIgnoreCase("movie")) {
	        event = new Movie(event_name, d, t, venue, total_seats, ticket_price, event_type,
	                "Action", "Actor X", "Actress Y");
	    } else if (event_type.equalsIgnoreCase("concert")) {
	        event = new Concert(event_name, d, t, venue, total_seats, ticket_price, event_type,
	                "Famous Band", "Rock");
	    } else if (event_type.equalsIgnoreCase("sports")) {
	        event = new Sports(event_name, d, t, venue, total_seats, ticket_price, event_type,
	                "Cricket", "Team A vs Team B");
	    }

	    if (event != null) {
	        events.add(event);
	    }

	    return event;
	}

	@Override
	public Event[] getEventDetails() {
	    return events.toArray(new Event[0]);
	}

	@Override
	public int getAvailableNoOfTickets(Event event) {
	    return event.getAvailable_seats();
	}

	@Override
	public double calculate_booking_cost(int num_tickets, Event event) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}






















