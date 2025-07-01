package com.hexaware.tbs.bean;


import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event {
    private String artist, type;

    public Concert(String event_name, LocalDate event_date, LocalTime event_time,
                   Venue venue, int total_seats, double ticket_price, String event_type,
                   String artist, String type) {
        super(event_name, event_date, event_time, venue, total_seats, ticket_price, event_type);
        this.artist = artist;
        this.type = type;
    }

    @Override
    public void display_event_details() {
        System.out.println("Concert: " + event_name + ", Artist: " + artist + ", Available seats: " + available_seats);
    }
}
