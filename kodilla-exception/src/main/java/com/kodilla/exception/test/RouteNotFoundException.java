package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(String message) {
        super(message);
    }


    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("New York", "London"));
        flights.add(new Flight("London", "New York"));
        flights.add(new Flight("Paris", "Warsaw"));
        flights.add(new Flight("Warsaw", "Paris"));


        for (Flight flight : flights) {
            try {
                findFlight.findFlight(flight);
                System.out.println("It is possible to fly fromm " + flight.getDepartureAirport()
                        + " to " + flight.getArrivalAirport());
            } catch (RouteNotFoundException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("check another flight...");
            }

        }
    }
}
