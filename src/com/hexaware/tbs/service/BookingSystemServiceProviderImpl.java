package com.hexaware.tbs.service;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.tbs.bean.*;
import com.hexaware.tbs.exception.EventNotFoundException;
import com.hexaware.tbs.exception.InvalidBookingIDException;

public class BookingSystemServiceProviderImpl extends EventServiceProviderImpl implements IBookingSystemServiceProvider {
    private List<Booking> bookings = new ArrayList<>();

    @Override
    public double calculate_booking_cost(int num_tickets, Event event) {
        return num_tickets * event.getTicket_price();
    }

    @Override
    public double book_tickets(String event_name, int num_tickets, Customer[] customers) throws EventNotFoundException {
        Event event = null;
        for (Event e : events) {
            if (e.getEvent_name().equalsIgnoreCase(event_name)) {
                event = e;
                break;
            }
        }
        if (event == null) {
            throw new EventNotFoundException("Event not found: " + event_name);
        }
        if (event.book_tickets(num_tickets)) {
            double cost = calculate_booking_cost(num_tickets, event);
            Booking booking = new Booking(event, List.of(customers), cost);
            bookings.add(booking);
            return cost;
        } else {
            System.out.println("Not enough seats!");
            return 0;
        }
    }

    @Override
    public boolean cancel_booking(int booking_id) throws InvalidBookingIDException {
        for (Booking b : bookings) {
            if (b.getBooking_id() == booking_id) {
                b.getEvent().cancel_booking(b.getEvent().getBookedNoOfTickets());
                bookings.remove(b);
                return true;
            }
        }
        throw new InvalidBookingIDException("Booking ID not found: " + booking_id);
    }


  
    @Override
    public void get_booking_details(int booking_id) throws InvalidBookingIDException {
        for (Booking b : bookings) {
            if (b.getBooking_id() == booking_id) {
                b.display_booking_details();
                return;
            }
        }
        throw new InvalidBookingIDException("Booking ID not found: " + booking_id);
    }

   

      
    
}
