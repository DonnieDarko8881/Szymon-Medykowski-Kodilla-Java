package com.kodilla.good.patterns.challanges.flight.flightInformation;


import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;

import java.util.Set;

public class ShowFoundFlightToCity implements ShowFoundFlight {
    @Override
    public void show(Set<Flight> toCity) {
        toCity.stream()
                .forEach(System.out::println);
    }
}