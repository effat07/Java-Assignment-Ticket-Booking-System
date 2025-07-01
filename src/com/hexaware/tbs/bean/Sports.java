package com.hexaware.tbs.bean;


import java.time.LocalDate;
import java.time.LocalTime;

public class Sports extends Event {
    private String sportName, teamsName;

    public Sports(String event_name, LocalDate event_date, LocalTime event_time,
                 Venue venue, int total_seats, double ticket_price, String event_type,
                 String sportName, String teamsName) {
        super(event_name, event_date, event_time, venue, total_seats, ticket_price, event_type);
        this.sportName = sportName;
        this.teamsName = teamsName;
    }

    @Override
    public void display_event_details() {
        System.out.println("Sport: " + sportName + ", Teams: " + teamsName + ", Available seats: " + available_seats);
    }
}
