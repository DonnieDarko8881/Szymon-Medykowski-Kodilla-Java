package com.kodilla.good.patterns.challanges.Flights.flightRetriever;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class FlightRetriever {

    public Set<Flight> retrieve() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(City.WARSZAWA, City.KRAKÓW, LocalTime.of(10, 10), LocalTime.of(11, 10)));
        flights.add(new Flight(City.WARSZAWA, City.POZNAN, LocalTime.of(10, 10), LocalTime.of(11, 10)));
        flights.add(new Flight(City.POZNAN, City.WROCŁAW, LocalTime.of(10, 10), LocalTime.of(11, 10)));
        flights.add(new Flight(City.KRAKÓW, City.WROCŁAW, LocalTime.of(10, 10), LocalTime.of(11, 10)));

        return flights;
    }


}
