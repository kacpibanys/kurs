package com.example.task_09_datetime;

import java.time.LocalDateTime;

public class Main {
    static void main(String[] args) {

        LocalDateTime invalidDepartureTime = LocalDateTime.of(2026, 3, 29, 2, 30);
        LocalDateTime validArrivalTime = LocalDateTime.of(2026, 3, 29, 15, 0);


        try {
            Flight flight = FlightFactory.buildFlight(
                    "ERR01",
                    "WAW",
                    "LAX",
                    invalidDepartureTime,
                    validArrivalTime
            );
        } catch (IllegalArgumentException e) {

            System.err.println("GIT");
            System.err.println(e.getMessage());
        }
    }
}
