package com.kodilla.good.patterns.challanges.Flights.flightInformation;
import com.kodilla.good.patterns.challanges.Flights.flightRetriever.Flight;
import java.util.Set;

public class ShowFoundFlightFromCity implements ShowFoundFlight {
    @Override
    public void show(Set<Flight> fromCity) {
        fromCity.stream()
                .forEach(System.out::println);
    }
}
