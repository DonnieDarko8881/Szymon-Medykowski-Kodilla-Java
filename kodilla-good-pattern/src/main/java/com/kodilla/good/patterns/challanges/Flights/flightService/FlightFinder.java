package com.kodilla.good.patterns.challanges.Flights.flightService;


import com.kodilla.good.patterns.challanges.Flights.flightRetriever.City;
import com.kodilla.good.patterns.challanges.Flights.flightRetriever.Flight;

import java.util.Set;

public interface FlightFinder {
    Set<Flight> find(Set<Flight> flights, City city);
}
