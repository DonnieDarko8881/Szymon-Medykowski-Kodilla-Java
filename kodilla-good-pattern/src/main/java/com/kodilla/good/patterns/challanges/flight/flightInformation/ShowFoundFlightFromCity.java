package com.kodilla.good.patterns.challanges.flight.flightInformation;

import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;

import java.util.Set;

public class ShowFoundFlightFromCity implements ShowFoundFlight {
    @Override
    public void show(Set<Flight> fromCity) {
        fromCity.stream()
                .forEach(System.out::println);
    }
}
