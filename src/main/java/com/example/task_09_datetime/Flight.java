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
        if (departureTime.toInstant().isAfter(arrivalTime.toInstant())) {
            throw new IllegalArgumentException("Arrival time cannot be before departure time");
        }
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;


    }

    public Duration calculateFlightDuration() {
        return Duration.between(this.departureTime.toInstant(), this.arrivalTime.toInstant());
    }

    public String getFormattedDuration() {
        Duration duration = calculateFlightDuration();
        long hours = duration.toHours();
        int minutes = duration.toMinutesPart();

        if (hours == 0) {
            return minutes + "m";
        } else if (minutes == 0) {
            return hours + "h";
        } else {
            return hours + "h " + minutes + "m";
        }
    }


}
