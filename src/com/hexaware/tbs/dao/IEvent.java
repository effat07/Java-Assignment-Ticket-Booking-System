package com.hexaware.tbs.dao;

public interface IEvent {
    void displayEventDetails();
    double calculateTotalRevenue();
    void bookTickets(int count);
    void cancelBooking(int count);
}

