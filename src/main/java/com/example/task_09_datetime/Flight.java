package com.example.task_09_datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Flight {
    String flightNumber;
    String departureAirport;
    String arrivalAirport;
    ZonedDateTime departureTime;
    ZonedDateTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        if (departureTime.toInstant().isBefore(arrivalTime.toInstant())) {
            throw new IllegalArgumentException("Departure time cannot be before arrival time");
        }
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;


    }

    public Duration calculateFlightDuration(LocalDateTime departureTime, LocalDateTime arrivalTime) {
        return Duration.between(departureTime, arrivalTime);
    }


}
