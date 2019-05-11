package com.kodilla.good.patterns.challanges.flight.flightService;

import com.kodilla.good.patterns.challanges.flight.flightRetriever.City;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinderFromCity implements FlightFinder {
    @Override
    public Set<Flight> find(Set<Flight> flights, City city) {
        return  flights.stream()
                .filter(flight -> flight.getCityOfDeparture().equals(city))
                .collect(Collectors.toSet());
    }
}
