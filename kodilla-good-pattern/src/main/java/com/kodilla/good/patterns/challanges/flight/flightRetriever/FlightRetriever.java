package com.kodilla.good.patterns.challanges.flight.flightRetriever;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class FlightRetriever {

    public Set<Flight> retrieve() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(City.WARSZAWA, City.KRAKÓW));
        flights.add(new Flight(City.WARSZAWA, City.POZNAN));
        flights.add(new Flight(City.POZNAN, City.WROCŁAW));
        flights.add(new Flight(City.KRAKÓW, City.WROCŁAW));

        return flights;
    }
}
