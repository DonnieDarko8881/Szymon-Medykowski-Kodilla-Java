package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Map<String, Boolean> airportAvailability = new HashMap<>();
        airportAvailability.put("New York", false);
        airportAvailability.put("Amsterdam", true);
        airportAvailability.put("Warsaw", true);
        airportAvailability.put("London", true);
        airportAvailability.put("Berlin", true);

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("New York", "London"));
        flights.add(new Flight("London", "New York"));
        flights.add(new Flight("Paris", "Warsaw"));
        flights.add(new Flight("Warsaw", "Paris"));

        FindFlight findFlight = new FindFlight(airportAvailability);

        for (Flight flight : flights) {
            try {
                findFlight.checkIfArrivalIsPossible(flight);
                findFlight.checkIfDepartureIsPossible(flight);
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

