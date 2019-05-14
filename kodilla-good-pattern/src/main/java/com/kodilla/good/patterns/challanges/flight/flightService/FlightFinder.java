package com.kodilla.good.patterns.challanges.flight.flightService;

import com.kodilla.good.patterns.challanges.flight.flightRetriever.City;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;

import java.util.Set;

public interface FlightFinder {
    Set<Flight> find(Set<Flight> flights, City city);
}
