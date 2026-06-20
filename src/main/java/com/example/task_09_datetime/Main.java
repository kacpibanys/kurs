package com.example.task_09_datetime;

import java.time.LocalDateTime;

public class Main {

    static void test1() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 15, 12, 30);
        String flightNumber = "1";
        String departureIATA = "WAW";
        String arrivalIATA = "WAW";
        System.out.println("--------------------TEST 1--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");
    }

    static void test2() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 23, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 16, 1, 30);
        String flightNumber = "2";
        String departureIATA = "WAW";
        String arrivalIATA = "WAW";
        System.out.println("--------------------TEST 2--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test3() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 15, 14, 0);
        String flightNumber = "3";
        String departureIATA = "WAW";
        String arrivalIATA = "JFK";
        System.out.println("--------------------TEST 3--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test4() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 3, 30, 1, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 3, 30, 5, 0);
        String flightNumber = "4";
        String departureIATA = "WAW";
        String arrivalIATA = "WAW";
        System.out.println("--------------------TEST 4--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test5() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 10, 26, 1, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 10, 26, 2, 30);
        String flightNumber = "5";
        String departureIATA = "WAW";
        String arrivalIATA = "WAW";
        System.out.println("--------------------TEST 5--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test6() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 14, 18, 0);
        String flightNumber = "6";
        String departureIATA = "TYO";
        String arrivalIATA = "LAX";
        System.out.println("--------------------TEST 6--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test7() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 14, 18, 0);
        String flightNumber = "7";
        String departureIATA = "XDD";
        String arrivalIATA = "LAX";
        System.out.println("--------------------TEST 7--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test8() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 15, 8, 0);
        String flightNumber = "8";
        String departureIATA = "WAW";
        String arrivalIATA = "WAW";
        System.out.println("--------------------TEST 8--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test9() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 10, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 15, 19, 0);
        String flightNumber = "9";
        String departureIATA = "WAW";
        String arrivalIATA = "KLK";
        System.out.println("--------------------TEST 9--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test10() {
        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 6, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 16, 6, 0);
        String flightNumber = "10";
        String departureIATA = "WAW";
        String arrivalIATA = "SGP";
        System.out.println("--------------------TEST 10--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test11OneWay() {

        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 8, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 15, 12, 0);
        String flightNumber = "11a";
        String departureIATA = "WAW";
        String arrivalIATA = "LDN";
        System.out.println("--------------------TEST 11--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        //System.out.println("---------------TESTING FINISHED---------------");

    }

    static void test11OrAnother() {

        LocalDateTime departureTime = LocalDateTime.of(2025, 1, 15, 16, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2025, 1, 15, 20, 0);
        String flightNumber = "11a";
        String departureIATA = "LDN";
        String arrivalIATA = "WAW";
        //System.out.println("--------------------TEST 11--------------------");
        try {
            Flight flight = FlightFactory.buildFlight(
                    flightNumber,
                    departureIATA,
                    arrivalIATA,
                    departureTime,
                    arrivalTime
            );
            System.out.println("Duration: " + flight.getFormattedDuration());
        } catch (IllegalArgumentException e) {

            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getMessage());
        }
        System.out.println("---------------TESTING FINISHED---------------");

    }


    static void main(String[] args) {

        test1();
        System.out.println("\n");
        test2();
        System.out.println("\n");
        test3();
        System.out.println("\n");
        test4();
        System.out.println("\n");
        test5();
        System.out.println("\n");
        test6();
        System.out.println("\n");
        test7();
        System.out.println("\n");
        test8();
        System.out.println("\n");
        test9();
        System.out.println("\n");
        test10();
        System.out.println("\n");
        test11OneWay();
        test11OrAnother();




    }
}
