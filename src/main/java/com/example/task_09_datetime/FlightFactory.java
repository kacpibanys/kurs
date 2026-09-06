package com.example.task_09_datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FlightFactory {
    public static Flight buildFlight(String flightNumber, String departureIATA, String arrivalIATA,
                                     LocalDateTime localDeparture, LocalDateTime localArrival){

        ZoneId departureZone = getZoneForIATA(departureIATA);
        ZoneId arrivalZone = getZoneForIATA(arrivalIATA);

        if (departureZone.getRules().getValidOffsets(localDeparture).isEmpty()) {
            throw new IllegalArgumentException("There is no such a departure time zone in departure zone");
        }
        if (arrivalZone.getRules().getValidOffsets(localArrival).isEmpty()) {
            throw new IllegalArgumentException("There is no such a arrival time zone in arrival zone");
        }

        ZonedDateTime zdtDeparture = localDeparture.atZone(departureZone).withEarlierOffsetAtOverlap();
        ZonedDateTime zdtArrival = localArrival.atZone(arrivalZone).withEarlierOffsetAtOverlap();

        return new Flight(flightNumber, departureIATA, arrivalIATA, zdtDeparture, zdtArrival);
    }

    public static ZoneId getZoneForIATA(String iata){
        return switch (iata){
            case "WAW" -> ZoneId.of("Europe/Warsaw");
            case "JFK" -> ZoneId.of("America/New_York");
            case "LAX" -> ZoneId.of("America/Los_Angeles");
            default -> throw new IllegalArgumentException("Unknown IATA: " + iata);
        };
    }
}
