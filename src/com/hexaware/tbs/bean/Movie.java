package com.hexaware.tbs.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movie extends Event {
    private String genre, actorName, actressName;

    public Movie(String event_name, LocalDate event_date, LocalTime event_time,
                 Venue venue, int total_seats, double ticket_price, String event_type,
                 String genre, String actorName, String actressName) {
        super(event_name, event_date, event_time, venue, total_seats, ticket_price, event_type);
        this.genre = genre;
        this.actorName = actorName;
        this.actressName = actressName;
    }


	@Override
    public void display_event_details() {
        System.out.println("Movie: " + event_name + ", Genre: " + genre + ", Available seats: " + available_seats);
    }
}