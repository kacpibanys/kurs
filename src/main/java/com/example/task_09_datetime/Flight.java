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
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

        if (departureTime.toInstant().isBefore(arrivalTime.toInstant())) {
            throw new IllegalArgumentException("Departure time cannot be before arrival time");
        }
    }

    public Duration calculateDuration(LocalDateTime departureTime, LocalDateTime arrivalTime) {
        return Duration.between(departureTime, arrivalTime);
    }


}
