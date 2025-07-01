package com.hexaware.tbs.service;

import com.hexaware.tbs.bean.Customer;
import com.hexaware.tbs.bean.Event;
import com.hexaware.tbs.exception.EventNotFoundException;
import com.hexaware.tbs.exception.InvalidBookingIDException;

public interface IBookingSystemServiceProvider {
    double calculate_booking_cost(int num_tickets, Event event);

    double book_tickets(String event_name, int num_tickets, Customer[] customers) throws EventNotFoundException;
    boolean cancel_booking(int booking_id) throws InvalidBookingIDException;

    void get_booking_details(int booking_id) throws InvalidBookingIDException;

}